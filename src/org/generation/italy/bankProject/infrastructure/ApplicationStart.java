package org.generation.italy.bankProject.infrastructure;

import org.generation.italy.bankProject.model.Account;
import org.generation.italy.bankProject.model.CaymanAccount;
import org.generation.italy.bankProject.model.special.SpecialAccount;

import java.time.LocalDate;
import java.util.Date;

public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application...");

        Account a1 = new Account(); //new è per creare l'oggetto

        //Date x = new Date();
        //java.sql.Date y = new java.sql.Date(x.getTime());   //getTime numero di secondi a partire dal 1 gennaio 1970
        // lo metto qui e non con import perchè ho gia un Date, quindi il computer non capirebbe quale prendere.

        System.out.println(a1.deposit(1000));

        System.out.println(a1.getBalance());
        a1.setBalance(1000);
        System.out.println(a1.getBalance());

        Account a2 = new Account(2500, LocalDate.of(2023, 1, 20), "Piero Rossi");

        CaymanAccount ca = new CaymanAccount();
        ca.deposit(10000);
        ca.evadeTax();

        //SpecialAccount sa2 = new String("SpecialAccount"); non funziona
        //SpecialAccount sa2 = new Account(2500, LocalDate.of(2023, 1, 20), "Piero Rossi"); non funziona
        Account a3 = new SpecialAccount(100_000, LocalDate.now(), "Pippo Baudo"); // funziona perchè SpecialAccount è figlia di account (concetto di sottinsieme)
        Account[] acs =new Account[10]; //array di Account
    }
    public static void handleAccounts(Account[] acs){
        for(int i=0; i < acs.length; i++){
            if (acs[i].getBalance()>1000) {
                acs[i].withdraw(10);
            }
        }
    }

    public static void handleAccount(Account x){
        String clientName=x.getClient();
        if(clientName!=null && clientName.length()>10 && clientName.startsWith("sa")){
            x.deposit(10);
        }
    }
}

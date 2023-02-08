package org.generation.italy.bankProject.model;

import java.time.LocalDate;

public class Account {
    protected double balance; //in una classe posso solo dichiarare variabili di classe, ma non posso fare if, for o codice.
    private final LocalDate openDate;  //final perchè così non si puo cambiare la data
    private String client;
    public Account(){  //Costruttore di default con parametri vuoti
        this(1000, LocalDate.now(), "Anonimo");
        //balance = 1000; // fa partire account di base a 1000
        //openDate = LocalDate.now(); // mi da la data di oggi, contata dal 1 Gennaio 1970 in millisecondi
        //client = "Anonimo";
    }

    public Account(double b, LocalDate ld, String clientName){
        balance = b;
        openDate = ld;
        client = clientName;
    }

    public Account(double c, LocalDate locD){
        this(c, locD, "Anonimo"); // richiama il costruttore principale (il secondo), sostituisce le righe successive
        //balance = c;                         prende quel costruttore perchè gli ho dato 3 valori, come nel costruttore precedente
        //openDate = locD;
        //client = "Anonimo";
    }

    public double getBalance(){  //incapsulation
        return balance/100;     //questo legge
    }

    public void setBalance(double amount) {  //incapsulation
        if (amount >= 0) {
            this.balance = amount * 100;         //questo scrive
        }
    }

    public LocalDate getOpenDate(){
        return openDate;
    }

    public String getClient(){
        return client;
    }
    public void setClient(String c){
        client=c;
    }

    public double deposit( double amount) {
        this.balance += amount;
        return balance;
    }

    /*public double deposit ( double amount, double extra) { // Method Overload, 2 funzioni con nome deposit, ma i parametri sono diversi
        balance += amount;
        balance += extra/2;
        return balance;
    }
    */ //----> Method Overloading <----

    public double withdraw( double amount){
        balance -= amount;
        return balance;
    }
}

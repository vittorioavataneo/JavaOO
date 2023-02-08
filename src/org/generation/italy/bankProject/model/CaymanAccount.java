package org.generation.italy.bankProject.model;


import java.time.LocalDate;

public class CaymanAccount extends Account{ //è subordinata ad Account (è figlia di classe Account)
    private String secretCode;
    public CaymanAccount(){ //costruttore di default, non prende nessun parametro
        super();  //richiama costruttore della madre, senza parametri sceglie quello di default
    }
    public CaymanAccount(double balance, LocalDate openDate, String clientName, String secretCode){
        super(balance, openDate, clientName); // Passi al costruttore mamma i valori, lo capisce dal numero di parametri
        this.secretCode = secretCode; //this indica l'indirizzo dell'oggetto che sto costruendo
    }
    public double evadeTax(){
        deposit(1000);
        return 0;
    }
}

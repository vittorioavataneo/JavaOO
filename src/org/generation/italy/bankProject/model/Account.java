package bankProject.model;

import java.time.LocalDate;

public class Account {
    public double balance;
    public LocalDate openDate;
    public String client;
    public double deposit ( double amount) {
        balance += amount;
        return balance;
    }

    /*public double deposit ( double amount, double extra) { // Method Overload, 2 funzioni con nome deposit, ma i parametri sono diversi
        balance += amount;
        balance += extra/2;
        return balance;
    }
    */ //----> Method Overloading <----

    public double withdraw ( double amount){
        balance -= amount;
        return balance;
    }
}

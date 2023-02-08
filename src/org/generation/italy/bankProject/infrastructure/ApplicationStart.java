package bankProject.infrastructure;

import bankProject.model.Account;
import java.util.Date;


public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application...");

        Account a1 = new Account();

        Date x = new Date();
        java.sql.Date y = new java.sql.Date(x.getTime());   //getTime numero di secondi a partire dal 1 gennaio 1970

    }
}

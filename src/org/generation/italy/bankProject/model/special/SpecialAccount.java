package org.generation.italy.bankProject.model.special;

import org.generation.italy.bankProject.model.Account;

import java.time.LocalDate;

public class SpecialAccount extends Account {
    public SpecialAccount(){
        super();
    }

    public SpecialAccount(double balance, LocalDate openDate, String clientName){
        super(balance, openDate, clientName);
    }
}

package org.generation.italy.bankProject.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Client {
    private long id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private char sex;

    public String getFullName(){
        return name + " " + lastName;
    }

    public String getFullNameSB(){
        StringBuilder sb = new StringBuilder(name).append(" ").append(lastName); //append aggiunge alla stringa, con stringbuilder
        //sb.append(" ");
        //sb.append(lastName);
        return sb.toString();
    }

    public int getAge(){
        Period t = birthDate.until(LocalDate.now());
        int years = t.getYears();
        return years;
    }

    public long getAge2(){
        long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        return (int)years;
    }

    public long getID(){
        return id;
    }

    public char getSex(){
        return sex;
    }

}

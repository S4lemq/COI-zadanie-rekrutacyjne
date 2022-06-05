package org.example;

import org.example.exceptions.InvalidLengthException;
import org.example.exceptions.InvalidPeselException;

import java.time.LocalDate;
import java.time.Period;

public class Task_17 {

    private LocalDate parsePeselToDate(String pesel){

        int month = Integer.parseInt(pesel.substring(2,4));
        int day = Integer.parseInt(pesel.substring(4,6));
        StringBuilder yearBuilder = new StringBuilder(pesel.substring(0, 2));
        int year;
        if(month>80){
            yearBuilder.insert(0, "18");
            month-=80;
        }else if(month>=21 && month<=32){
            yearBuilder.insert(0, "20");
            month-=20;
        }else{
            yearBuilder.insert(0, "19");
        }
        year = Integer.parseInt(String.valueOf(yearBuilder));
        return LocalDate.of(year, month, day);
    }

    private boolean validatePesel(String pesel){
        if(pesel.length()!=11){
            throw new InvalidLengthException();
        }
        int a = Character.getNumericValue(pesel.charAt(0));
        int b = Character.getNumericValue(pesel.charAt(1));
        int c = Character.getNumericValue(pesel.charAt(2));
        int d = Character.getNumericValue(pesel.charAt(3));
        int e = Character.getNumericValue(pesel.charAt(4));
        int f = Character.getNumericValue(pesel.charAt(5));
        int g = Character.getNumericValue(pesel.charAt(6));
        int h = Character.getNumericValue(pesel.charAt(7));
        int i = Character.getNumericValue(pesel.charAt(8));
        int j = Character.getNumericValue(pesel.charAt(9));
        int lastVal = Character.getNumericValue(pesel.charAt(10));
        int result = Math.abs((((a+(3*b)+(7*c)+(9*d)+(e)+(3*f)+(7*g)+(9*h)+(i)+(3*j))%10)-10)%10);
        return result==lastVal;
    }

    public boolean checkLegalAge(String pesel){
        if(!validatePesel(pesel)) {
            throw new InvalidPeselException();
        }
        LocalDate birthday = parsePeselToDate(pesel);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears()>=18;
    }
}

package org.example;
import java.util.*;


public class Task_9 {

    public boolean checkWords(String firstWord, String secondWord) {
        if(firstWord == null || secondWord == null) return false;
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}

package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class Task_8 {

    public static void main(String[] args) {
        Task_8 main = new Task_8();
        String[] trees = {"brzoza", "modrzew", "grab", "buk", "wierzba"};
        main.iterateArrayGeneric(trees);
        System.out.println("==========================");
        main.iterateArray(trees);
    }

    private static <T> void iterateArrayGeneric(T[] array) {
        Iterator<T> iterator = Arrays.stream(array).iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterateArray(String[] array){
        Iterator<String> iterator = Arrays.stream(array).iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

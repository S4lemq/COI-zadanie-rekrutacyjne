package org.example;

import java.util.*;

public class Task_18 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new Vector<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.print(getElement(set, 1));
    }

    private static String getElement(Object list, Integer number) {
        if(list instanceof AbstractList){
            return ((List)list).get(number).toString();
        }
        throw new RuntimeException("can not cast");
    }
}

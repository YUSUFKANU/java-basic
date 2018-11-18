package com.sda.example.zajecia6;

import java.util.HashSet;
import java.util.Set;

/**
 */
public class ArrayListExample {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Marek");
//        list.add("Janek");
//        list.add(null);
//
//        for (String element : list) {
//            System.out.println(element);
//        }
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put("matematyka", 6);
//        map.put("fizyka", 5);
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Klucz: " + entry.getKey() + " wartość: " + entry.getValue());
//        }
//
//        Set<String> set = new HashSet<>();
//        set.add("Janek");
//        set.add("dwehfijwhdifh");
//        set.add("Janek");
//
//        for (String element : set) {
//            System.out.println(element);
//        }

        Person p1 = new Person("Jan", "Kowalski");
        Person p2 = new Person("Andrzej", "Kowalski");
        Person p3 = new Person("Tomasz", "Nowak");

        Set<Person> set = new HashSet<>();
        set.add(p2);
        set.add(p1);
        set.add(p3);

        for (Person p : set) {
            System.out.println(p.toString());
        }

    }
}

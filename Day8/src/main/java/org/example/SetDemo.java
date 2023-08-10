package org.example;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(55);

        Set<Integer> set1 = new TreeSet<Integer>();

        Collection<Integer> set2 = new TreeSet<>();

        set1.add(54);
        set2.add(50);

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
 }

package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(54);
        c.add(54);
        c.add(54);
        c.add(54);

        Collection<Integer> c2 = new ArrayList<Integer>();
        c2.add(7);
        c2.add(23);



        List<Integer> c1 = new ArrayList<Integer>();
        c1.add(8);
        c1.add(9);

        System.out.println(c.toArray()[2]);
        System.out.println(c1.get(1));
    }
}

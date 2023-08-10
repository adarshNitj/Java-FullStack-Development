package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>empReview = new HashMap<>();

        empReview.put("adarsh", 22);
        empReview.put("adarshi",23);

        System.out.println(empReview);

        System.out.println(empReview.get("adarsh"));
        System.out.println(empReview.keySet());

        for (String name: empReview.keySet())
            System.out.println(name+" "+ empReview.get(name));

    }
}



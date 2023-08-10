package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("Please input the value");

//        int n1 = System.in.read();

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);

        int n1 = Integer.parseInt(br.readLine());
        System.out.println(n1);
    }
}

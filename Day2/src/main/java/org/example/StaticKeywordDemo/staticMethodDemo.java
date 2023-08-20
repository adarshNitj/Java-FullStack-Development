package org.example.StaticKeywordDemo;

public class staticMethodDemo {
    public static int add = 5;

    public  static void main(String[] args) {
//        staticMethodDemo ob = new staticMethodDemo();
         int res = add(15);
         System.out.println(res);
    }
    public static int add(int value){
        return value+add;
    }
}

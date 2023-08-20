package org.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App ob = new App();
        ob.add(2,3);
        ob.multiply(2,3);
    }

    public int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    public int multiply(int a,int b){
        System.out.println(a*b);
        return a*b;
    }
}

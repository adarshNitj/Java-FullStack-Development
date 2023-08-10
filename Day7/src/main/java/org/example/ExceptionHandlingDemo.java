package org.example;

//import.java.util.*;

public class ExceptionHandlingDemo {

    public static void main(String[] args) throws InvalidDigitException{

        int a =3;
        int b= 0;

        try {
            int c = a / b;
            System.out.println("ans" + c);
        }catch (Exception e){
            System.out.println("Exception : "+ e);
        }

//        -------------------------------------------------------------------------------------------------------

        int arr[] = {1,2,3,4};

        try{
            int c = a/b;
            for(int i=0;i<10;i++)
                System.out.print(arr[i]+",");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+ e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+ e);
        }
        catch(Exception e){
            System.out.print(" Exception: "+ e);
        }

        finally {
            System.out.println("Finally block used to print set of statements to be printed irrespective of the exceptions");
        }

        //  -------------------------------------------------------------------------------------------------------------------------------------------

        // throw keyword & throws keyword
        int p=0,q=5;

        try {
            p = -12 / q;
            if(p<0) {
                throw new InvalidDigitException("Invalid value of p");
            }
        }
        catch (InvalidDigitException e){
            System.out.println("custom");
            System.out.println(e.getMessage());

        }

//        ---------------------------------------------------------------------



    }

    private static class InvalidDigitException extends Exception {
        public InvalidDigitException(String idValueOfP) {
            super(idValueOfP);
        }
    }
}

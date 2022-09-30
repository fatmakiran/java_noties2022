package day05;

import java.util.Scanner;

public class Day05Modulus {

    /*
    modulus operator : % is called 'modulus operator' in java
    13/5==>modulus operator gives you 3
    13%5 == > 3

     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n =input.nextInt();
        int absN= Math.abs(n);

        // ask user to enter an integer the print  the last digit of the  integer on the consol
        int lastDigit = n % 10;
        System.out.println(lastDigit);

        //Ask user to enter his birth year ,then print just last 2 digits on the console
int lastTwoDigits = absN % 100;
        System.out.println(lastTwoDigits);

        //Ask user to enter on integer ,then check if the number is even
        System.out.println(absN % 2 == 0);

//Ask user to enter on integer ,then check if the number is odd
        System.out.println(absN  % 2!=0);
//ask user  to enter  a 3 digits integer the find the sum of the digits
     int last =  absN % 10 ;

        absN = absN /10;
        int second = absN%10;

        absN =absN / 10;
        int first =absN % 10;

        System.out.println(last+second+first);






    }
}

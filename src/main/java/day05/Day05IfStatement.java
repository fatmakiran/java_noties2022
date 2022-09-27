package day05;

import java.util.Scanner;

public class Day05IfStatement {

    /*
    If your score is less than 50 then you will fail
    if (condition){
    <The code to be executed if the condition is true

    }

    NOTE: We use if Statement
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();
        //Type code to check if the integer  got from user is divided  by 3 or not
        if (n % 3 == 0) {
            System.out.println("The number is dividet by 3");
        }
        if (n % 3 != 0) {
            System.out.println("The number is not dividet by 3");
            //Type code to check if the first digit of a 3 digits integer is less than 5.
            //if it is less than 5 print 'perfect number 'otherwise print 'good number'
            if (n / 100 < 5) {
                System.out.println("Perfect number");

            }
            if (n / 100 >= 5) {

                System.out.println("Good number");
            }
            System.out.println("Enter the initial of any day name ");
            String  s=input.next();
            if(s.equals("S")){
                System.out.println("Saturday and Sunday");

            }if (s.equals("T")){
                System.out.println("Tuesday and Thursday");
            }


        }
    }
}

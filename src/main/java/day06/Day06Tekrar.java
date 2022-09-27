package day06;

import java.util.Scanner;

public class Day06Tekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();

        if (score < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
        System.out.println("Enter day number");
        int dayNum = input.nextInt();
        if (dayNum == 1) {
            System.out.println("monday");

        }
        if (dayNum == 2) {
            System.out.println("tuesday");

        }
        if (dayNum == 2) {
            System.out.println("Wednesday");
        }if (dayNum==3){
            System.out.println("Thursday");

        }if (dayNum==4){
            System.out.println("Friday");
        }if (dayNum==6){
            System.out.println("Saturday");
        }if (dayNum==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter a valid day number");
        }

    }

}
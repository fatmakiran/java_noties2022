package day04;

import java.util.Scanner;

public class Day04Scanner {
    /*
    Scanner class is used to interact with user
    To interect with the user by usering Scanner Class fallow the steps
    1) Create a Scanner Class object
    2) give a message to the user
    3)put the data coming from user into memory


     */

    public static void main(String[] args) {
      //1) Create a Scanner Class object
        Scanner input= new Scanner(System.in);  // 1 . komutu yaptik

        //2) give a message to the user
        System.out.println("Enter your age...");

        //  3)put the data coming from user into memory
        int age = input.nextInt();
        System.out.println(age);
    }
}

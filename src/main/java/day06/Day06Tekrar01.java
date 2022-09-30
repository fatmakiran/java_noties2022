package day06;

import java.util.Scanner;

public class Day06Tekrar01 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Pasword");
        String pwd=input.next();

        if(pwd.length()<8){
            System.out.println("Pasword is invalid because it does not have at list 8 characters");


        }else if ((pwd.replaceAll("[^A-Z]", "")).length()==0){
            System.out.println("password is invalid because it does not have any uppercase");

        } else if ((pwd.replaceAll("[^a-z]", "")).length()==0) {
            System.out.println("password is invalid because it does not have any lowercase");

        } else if ((pwd.replaceAll("[A-Za-z0-9]", "")).length()==0) {
            System.out.println("password is invalid because it does not have any symbol");

        }else{
            System.out.println("password is valid");

        }


    }
}

package day04;

import java.util.Scanner;

public class Day04Scanner02 {
   /*
   ask user to enter  the width  and the length  of a rectangle then print the area and perimeter n te cinsole


    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("Enter the length of the rectangle");
        double length = input.nextDouble();
        System.out.println("Area is :"+width*length);
        System.out.println("Perimeter is:"+2*(width+length));



    }
}

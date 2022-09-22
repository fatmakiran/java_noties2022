package day02;

public class Day02MethodCreation {
    public static void main(String[] args) {

        System.out.println(addIntegers(12, 5));
        System.out.println(multiplyIntegers(8,5));
        System.out.println(subractIntegers( 12 ,7));
        System.out.println(divideIntegers(24.6 ,4));

    }
    // Create an addition method

    public static int addIntegers(int a, int b){

        return  a+b;

    }
    //Creat amultiplication method

    public static  int multiplyIntegers(int a, int b){
        return a*b;

    }
    //Create a subtraction method
    public static int subractIntegers(int a, int b){


        return  a-b;
    }
    //Create a dynamic division method
   int num1=10;
    int num2= 20;








    public static double divideIntegers(double a ,int b){

        return a/b;
    }

   //Note  a/b if you use same data types for all values in matematical operation ,the result will be
    //     in the same data type

    //note2: if you use  different data types in a matematical operation , the result
    // will be in the largest data type . example ; double /int ==>> double

    /*
    what did we learn so far?
    1) how to create dynamic methods
    2)How to use  a method in "main methos"
    3)How to print  the result of the method  on the consol
    4)How to decide return type when you create a method.
    5)How to work data types in methatical  operation








     */
}

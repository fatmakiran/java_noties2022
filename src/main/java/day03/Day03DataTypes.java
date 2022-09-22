package day03;

import java.sql.SQLOutput;
import java.util.Locale;

public class Day03DataTypes {

    public static void main(String[] args) {
        /*
    Type Casting : Converting  number  primitive data type to another primitive data type
   Note 1: if you convert small  data type to large  data type ,it is called "Auto Widening"
   Note 2:  if you convert large  data type to small  data type ,it is called "Explicit Narroving"

  Wrapper Class : wrapper classes are classes for primitive number data types
  byte ==> Byte
  short==>Short
  *** int ==>integer
  long ==>Long
  float ==> Float
  double ===> Double
  ** char ===> Character
  boolean ===> Boolean

  memory Usage in java
  there are 2 types of memories in java
  1) stack memory===>small
  2) Heap memory ===>huge

  NOTE: Primitive data is stored in stack memory
  note 2:Java puts the adresses (reference) of non-primitive  data into  "Stack MEmory"

    byte - short -int - long -float - double  ====>>>
    // Auto Widening
    byte age = 12;

    int myAge = age;
    short populationOfVillage = 21000;
    double myPopulationOfVillage = populationOfVillage;

   // Explicit Narroving
   double x = 23.45;
   long y = (long)x;

    */
        String name = "Mark Twain";

        System.out.println(name.toUpperCase());//MARK TWAIN

        System.out.println(name.toLowerCase()); //mark twain

        //find the numbers of character in name  String variable
        System.out.println(name.length());// 10 character
        System.out.println(name.length()-1);

        //Wrapper Classes
        Byte yourAge= 13;  //when you use wrapper class ,you are  having some method to use
        Boolean isOld = true;

        //if a method of static ,you can access to the method by usuing class name
        System.out.println(Byte.MIN_VALUE);// -128
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Float.MIN_VALUE);//1.4E-45

        System.out.println(Long.MAX_VALUE);//9223372036854775807

        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308

        //parantezi olmayanlar method degil

       // Auto Boxing is done by java automaticaly

       int a = 12;  //===> primitive
       Integer b = a; //it is NON-PRIMITIVE because in the wrapper Class
                      //Wrapper Class da oldugu icin non-primitive oluyor

        //Un-Boxing is done by java automatically
     int c = b;

    }
}

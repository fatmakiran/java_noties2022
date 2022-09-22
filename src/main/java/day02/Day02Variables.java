package day02;

public class Day02Variables {

    public static void  main(String[]args){
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //if you create  a variable inside  the "main method"

        //Create a char variable
        char initial = 'S';
        //NOT: dont forget to put the value beetween single quotes
        //Default value  of char is no the character whose value is zero

        //Create a boolean variable
        //Default value of boolean is false
        boolean isOld= true;
        boolean isAlive = false;

        //Create a byte variable
        byte ageOfStd = 13;

        //Create a short Variable
        short populationOfVillage=21000;

        //Create  a long variable
        //Do not forget  to put L to the end  when you create  along variable
        long populationOfWorld= 765L;

    }
    //How to create a variable
             // Data Type -Variable Name =Equals sign-Value-Semi Colon
     static      int         age             =         12      ;
    //Create a integer variable
   static int height =183;

    //Create a double variable
    static double weight =85.7;// burada access modifier yazilmiyor
                                //cunku default access modifier olan default yazilmaz

    // Note: if you do not type any access modifier ,it means  the access modifier is default

    /*
    Data types in Java
    1)Primitive DataTypes:
    i) Those  data types were created by java , we cannot  create any primitive data type
    ii)Primitive data types are 8
    a) byte - short-int- long- float- double /char -boolean

       char: it is for single characters like  A, h,? ,! etc.
       boolean : it is for true -false values

       byte : it is used for the value  from -128 to 127.it is for whole numbers
       short : it is used for the value  from -32 thousand  sth to positive 32 thousand  sth
       int : it is used for the value  from 2 billion sth billion  sth.it is for whole numbers
       long:it is used for the value  from .........to...... it is for whole numbers

       float :it is used for decimals. float uses memory less than double .
       when  you create float as data type  you have to put 'F' or 'f' at the end
       float has 7 digits  at most in decimal part
       double:  :it is used for decimals.double  is used for scientific researches
       double has 16 digits  at most in decimal part.
    2)non-Primitive Data Types
    I)Those  data types can be created  by java and by java Developers
    String is a non-primitive data type
    String data type is used for multiple characters

    INTERVIEW QUESTION

  not:What is difference  between  "Primitive" and "non_Primitive" data types?
Answer: There are 4 main  differences
     i)Primitive" data types start with lower case "non_Primitive "data types start with upper case
     ii)Primitive" data types can be created just by java not by developers, "non_Primitive "data types
         can be created by java and by java developers
     iii)Primitive" data types  use different size of memory but"non_Primitive "data types use memory same

    **** iv)Primitive" data types  have just values in it but "non_Primitive "data types have 'values'and 'methods in it.
   primitive ones do not have actions
   primitive are passive variable
   they do not method it means they do not have actions

   non-primitive ones have values those are passive characteristic at the same time they have method

     */
   String nameOfStd="Mark Twain";
   String stdId="Mt2022_01";


}

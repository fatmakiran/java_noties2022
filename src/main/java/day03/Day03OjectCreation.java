package day03;

public class Day03OjectCreation {
    /*
     we learned  how to create template
     1)How to create a class
     2)How to create methods in a class
     3)How to create variables in a class

      template is class but inside the class you will have method ,actions ,variables for passing featers
      How to create object from a class
 */
    public static void main(String[] args) {
   //Create an object to be able to use non static class members means (method +variables)
    //How to create an object you will type first class name
         // Class name       Object name     =   new      Class Name()      ;

        Day03OjectCreation            myObject       =                 new            Day03OjectCreation();
    //hey java i will that template//everything when you create//in java  there are 2 type of creating//this is constructor
                                    //sth in java name  it     //1)From scratch(new)                  //and it consructors the object
                                                                //2)From an existing data
        System.out.println(myObject.calculateAge(1990));
        System.out.println(myObject.printName("Mark","Twain"));
        System.out.println(myObject.height);
        System.out.println(myObject.id);
    }
    public  String printName(String firstname,String lastname){//non-static method olusturduk
        return firstname +" "+lastname;
    }
   public  int calculateAge(int dob){
      return 2022- dob;
}
   int height=185;
   String id ="Sp2022-001";

}

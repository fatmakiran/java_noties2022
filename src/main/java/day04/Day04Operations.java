package day04;

public class Day04Operations {
    /*
    Operations
    1) +, - ,* ,/  i)operations inside parenthesis
                   ii) Multiplications and division
                   iii)Additions and subractions

     2) Increment and Decrement operations
     Increase ===>addition and multiplication
     Decrement ===>subraction and division

      3)Comparison Operators
      > , < , >= ,<=, ==,!=
      note: In math ,single equals sign '='  means equality but in java double equals sign '==' means equality
      note:in java '!' means ' not'  so
      note : All comparison operators return boolean

      4) Locikal operator
      i) AND operator: && ===>This operator is used between two boolean values
      true && true ===> true
      true &7 false ===> false
      false && false ===> false
      false && false ===> false

      ii) OR operator: ||  ===> this operator  is used between two boolean values


      true || true ===> true
      true || false ===> true
      false || false ===> false
      false || true ===> true

     */

    public static void main(String[] args) {
      // increment
        int result = 10 - 6/(2 +5/5) + 7;
        System.out.println(result);
        int a = 12;
        a = a + 3;
        //a + =3;

        int b = 4;
        b= b*4;
        //decrement
        int c = 18;
        c-=3;
        System.out.println(c);//15
        int d = 24;
        d/=6;
        System.out.println(d);
        //Increment and decrement by 1
        int e =12;
        e=e +1;  //13
        e+=1;  //14
        e++;   //15  that synteax can be used just to increase by1
        System.out.println(e);
        int f = 13;
        f= f-1;   //12
        f-=1;   //11
        f--;   //10

        //Comparisons operators
        int h = 12;
        int i = 13 ;
        System.out.println(h<i);  //true
        System.out.println(h==i);  //false
        System.out.println(h<=i);  //true
        System.out.println(h!=i);  //true

        //logical operator
        System.out.println(3<4 && 5>1); // true
        System.out.println(3>4 && 5>1); // false

        System.out.println(3>4 || 5>6);// false

       // post -increment and pre -increment
        //1  post increment
        int x = 12;


        int y = x++;  // 12  ONEMLI
        System.out.println(y); //12
        System.out.println(x); // 13

        //pre-increment
        int m = 12;
        int n = ++m;  //13
        System.out.println(n);//13





    }
}

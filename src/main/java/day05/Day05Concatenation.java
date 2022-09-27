package day05;

public class Day05Concatenation {

    /*
    cocatenation : joining  String  with each other  or with data types
                  To do concatenation  we have 2 options ;
                  1) Use  '+' sign ===> Can be use d with all data  types
                  2)Use  'concat()' method===>Inside the concat() method paranthesis  you can put just String




     */


    public static void main(String[] args) {

        String s = "Tom";
        String t = " Hanks";
        int i = 12;
        int k = 5;
        char c = 'A';
        System.out.println(s+t);// Tom Hanks
        System.out.println(s.concat((" ").concat(t)));//Tom Hanks

        System.out.println(s+i +k);


        System.out.println(s+ ( i+k));// Tom17

        System.out.println(i + k + s);

        System.out.println(s + k*i); //tom60

        System.out.println(i+ c+s);// 77Tom

        System.out.println(c+s+k);//ATom5









    }
}

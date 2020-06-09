package OfficeHours.Practice_04_01_2020;

public class literal_new {
    public static void main(String[] args) {


        String s1 = "Java"; //String literal
        String s2 = "Java"; //String literal
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1==s2); //true, same objects.
        System.out.println(s1==s3); //false, different object and Different Memory
        System.out.println(s4==s3); //false different object
        /*IMMUTUBLE ==> they are not gonna be change
        * String is immutable
        *      once the object is created it wont change
        * String is sequences of characters
        * String str="cybertek123$#";
        * //index:    123456567*/



    }
}
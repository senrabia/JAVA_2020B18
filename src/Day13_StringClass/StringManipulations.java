package Day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
       /* 3==>. String represents the sequences of characters
        each character in String has a representive number called index number
        index number :starts from zero, cannat be less than zero
        String str1="Cybertek";
        // index:   01234567.....
        String str="Cat Dog";
        // index:   01234567....
  STRING MANIPULATION=
        charAt(indexNumber ): it returns the char at the given index
        lenght(): returns the total number of characters as int lengt is
                  ALWAYS one unit above the maximum index number.
        maxIndex:lenght()-1;
        concat(Value): Concatination, concats the given value to the String and returns a new value.
        toLowercase:converts to lowercase and returns a new String.
        toUpperCase:converts to Uppercase and returns a new String.
        trim:Only remove (bastaki ve sondaki bosluklari giderir)
        */

       String str="Cybertek";
        //          01234567
        //CHAR=========================
      char ch1= str.charAt(5);
        System.out.println(ch1);  //'t' it give me .
       // System.out.println(ch1=='A'); it give me false 't'=='A'is always FALSE
        //LENGHT=======================
        int totalLenght=str.length();
        System.out.println(totalLenght);

        System.out.println(totalLenght>250); //false

        String str2="Today is great day, Java is fun";
                     //01234567.............
        int maxIndexNum=str2.length()-1;
        System.out.println(maxIndexNum);
        //STRING=============================

        String s1="Cybertek";
               s1.concat("School"); //"School"
        // s1=s1.concat("School"); //"Cybertek School"
        System.out.println(s1);
        String s2="Java";
        System.out.println( s2.concat(" is a programming language")); //give me whole
        System.out.println(s2);//give me 'java"
        s2=s2.concat("is a programming language");
        System.out.println(s2);//
        //STRING CONTINIU========================
        String r1="Java is fun";
               r1=r1.concat(", and it's easy");
        System.out.println(r1);
        //LOWERCASE=============================
        String name1="CYBERTEK";
               name1=name1.toLowerCase();
        System.out.println(name1);
        //UPPERCASE=============================
        String name2="cybertek school";
               name2=name2.toUpperCase();
        System.out.println(name2);
        //TRIM(duzeltmek, duzenlemek.)
        String A1="     Today is a great day          ";
               A1=A1.trim();// it is TRIM space==>Cumle icindekileri etkilemez.
        System.out.println(A1);












    }
}

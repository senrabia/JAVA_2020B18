package Day13_StringClass;

import java.util.Scanner;

public class StringLiterals {
    /*RUULSS === STRING==> IS OBJECT
    heap=(YIGIN)
    literal=(TAM)
    immutuble=(DEGISMEZ)
      1==>Object, there are two we can create string object
         1.String literals:
           String str="Rabia";
         2.new keyword:
           String str2=new String("Cybertek");
           String pool: special memory location for String literal(TAM) object.
           Java Heap:memory location in java that where all object will be saved at.
       2==>. String is IMMUTABLE:
                once the object is created, cannot change it
       3==>. String represents the sequences of characters
             each character in String has a representive number called index number
             index number :starts from zero, cannat be less than zero
             String str1="Cybertek";
             // index:   01234567.....
             String str="Cat Dog";
             // index:   01234567....*/
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);


        String str1 = "Cat";      //it can take string POOL
        String str2 = new String("Cat");

        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);
     //=====================================
        String str3="cat";        //String Pool
        System.out.println(str1==str3);
        String str4=new String("cat");
        System.out.println(str2==str4);
     //======================================
        String s1="Java";          //String Pool, immutable we cannat modify it
        s1="JavaScript";
        System.out.println(s1);    //It give me Java Script because this is last one.
        String s2="java";          //no new object will be created in the memory.
        System.out.println(s1==s2);//false
                                   //"JavaScript"=="Java"



    }
}

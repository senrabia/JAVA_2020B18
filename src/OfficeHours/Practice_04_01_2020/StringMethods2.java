package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {
        //isEmpty(): checks if the String is empty, returns boolean.
        String str1=" ";
        boolean r1=str1.isEmpty();
        boolean r2=!str1.isEmpty();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("===============================");
        // equals(str): checks if the two strong of texts are equal or not,returns
        // equalsIgnoreCase(str): check if the two strong of text are equals
        //==
        String s1="cat";
        String s2=new String("cat");
        String s3="Cat";

        System.out.println(s1==s2);       //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s3.equals(s1)); //false, case sensitivity
        System.out.println(s3.equalsIgnoreCase(s1)); //true ignores the case
        System.out.println("======================================" );
        //=>CONTAINS==> cpntains(str): checks if the str is included in the strin, returns boolean

        String sentence=" I ,like to learn Java";
        System.out.println(sentence.contains("java")); //true
        String sentence2="Top 3 Viruses are:  1.Corona, 2.Hanta,3.Ebola";
        System.out.println(sentence2.contains("Java")); //false
        System.out.println("====================================");
        // startWith(str):checjs if the string started with given str
        //endsWith(str):check if the string ended with given str
        String webAddress="www.amazon.com";
        System.out.println(webAddress.startsWith("www"));  //false
        System.out.println(webAddress.startsWith("WWWW")); //false

        String gmail="CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));//true
        System.out.println(gmail.endsWith("@hotmail.com"));//false
        System.out.println(gmail.endsWith("@coldmail.com"));//false


    }
}

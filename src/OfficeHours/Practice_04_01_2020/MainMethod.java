package OfficeHours.Practice_04_01_2020;

public class MainMethod {
    public static void main(String[] args) {
        //=>INDEX==>charAt(indexNumber):returns the char at given index, char primitive.
   String str1="Java";
         //     0123
        char ch1=str1.charAt(3);
        System.out.println(ch1);
        System.out.println("=====================================");
        // OUT OF RANGE==>char ch2=str1.charAt(4);  //String index aut of renge:4
        //System.out.println(ch2);
        //=>LENGHT==> length():returns the total number of chars, int
        String str2="Cybertek School";
        int total=str2.length();
        System.out.println(total);
        int maxIndex=str2.length()-1; //last
        char ch3=str2.charAt(maxIndex);
        System.out.println(ch3);
        System.out.println("========================================");
        //=>CONCAT==>concat(str):concatenation, returns new String, + olso does concatination
        String str3="cybertek";
               str3=str3.concat(" School");//Cybertek School
        System.out.println(str3);
        String str4="Java";
               str4=str4.concat(" is fun");
        System.out.println(str4);
        String str="Java";
        System.out.println("========================================");
        //=>UP-LOW CAS==>toLowerCase():change of the srings to upper or lower
        String str5="CYBERTEK SCHOOL";
        str5=str.toLowerCase();
        System.out.println(str5);
        String str6="muhtar";
               str6= str6.toUpperCase();  //" MUHTAR"
        System.out.println("=====================================");
        //if we need just some upper or lowercase (Yes)
        //=>TRIM==>
         String str7="      Cybertek";
         str7=str7.trim();// Cybertek"
        System.out.println(str7);
        System.out.println(str7.length());

        String str8="        ";
               str=str8.trim();
        System.out.println(str8.length());   // this give me 0
        System.out.println("===================================");
        /*substring(beginningindex, ending index):creates substring starting from
        */
        String sentence1="I like java";
         //               012345678910..
        // last index number=lengt-1
        String word1=sentence1.substring(7,sentence1.length()); //"java"
        String word2=sentence1.substring(2,6);
        // "likeJava"
        String word3=sentence1.substring(2,6)+sentence1.substring(7,sentence1.length());
        System.out.println(word1);
        System.out.println(word2);
        //substring(beginning Index):creates the sub string from begginning i ndex tiil
        String sentence2="I like to learn Java";
        //                123456789..........
        String r1=sentence2.substring(10); //"learn Java";
        System.out.println(r1);
        String r2="Java"; //Java;
        String r3=r2.substring(0,2); // ja
        String r4=r2.substring(2,3); //v
                r4=r4.toUpperCase(); //v
        String r5=r2.substring(3);  //a
        String result=r3+r4+r5; //Java
        System.out.println(result);
        System.out.println("=======================================");










    }
}

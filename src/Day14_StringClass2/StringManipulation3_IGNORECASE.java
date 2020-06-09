package Day14_StringClass2;

public class StringManipulation3_IGNORECASE {
    /*    => equalToIgnoreCase(str):checks if two string'visible texta are equal or not
    DOES NOT care casesensitivity.
             A==a ==>true
           => contains(str):check if the str is contained in the string. returns boolean

           if str contained ==>true
            otherwise==>false.
          =>stratsWith(str):checks if the string starts with the given str.
;
    * */
    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2));//true, ignore case sensitive.
        String s1 = "Cybertek School";

        boolean r1 = s1.contains("school");//true
        System.out.println(r1);
        System.out.println("==================================");
        String PassWord = " mmsd 12345";
        if (PassWord.contains(" ")) {
            System.out.println("Pasword cannot have in it");
        } else {
            System.out.println("valid password");
        }
        System.out.println("==============================");
        /*every website has "www." at the beginning of the web adress.

         */

        String webAdress = "amazWWW.on.com";
        //webAdress=webAdress.toLowercase();
        if (webAdress.startsWith("www.")) {//false
            System.out.println("valid");
        }
        System.out.println("============================");
        /*every single gmail adress ends with @gmail.com*/
        String email = "CybertekSchool@Yahoo.com";
        if (email.endsWith("@gmail.com")) {
            System.out.println("valid Gmail");
        } else {
            System.out.println("Invalid gmail");
        }
        /* write a program that can validate if a web adress is valid
         valid web adress:
               MUST start with www.
               Must ends with .com, or. edu, .net or .gov
         */

    }
}

















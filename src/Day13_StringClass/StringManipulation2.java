package Day13_StringClass;

public class StringManipulation2 {

    public static void main(String[] args) {
        /*==>Subtring(beggining index, ending index): creates substring of the
        string value from the beggining index till the ending index(ending index is EXCLUDED)
         ==>substring (beginning index):creates substring of the string value from the
         begining index till the end.
         replace (old Value, new Value ):new value will be replace with all the given
         old value, and returns new stering.
         replaceFirst:new value will be replace with all the given
         old value, and returns new stering.
         IndexOf(Value): returns index
         * */

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0, 7);
        System.out.println(schoolName);
        //FULLNAME==============================
        String fullName = "Kuzzat Altay";
        //               123456789...
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7, 11 + 1);//+1 IMPORTANT veya 12 yazabiliriz
        System.out.println(firstName);
        System.out.println(lastName);
        //GMAIL CONVERT=================================
        // full name= firstName lastName
        //gmail:lastname_firstname@gmail.com
        String Murtaza = "murtaza Nazeeri";
        //              012345678.......
        String firstname = Murtaza.substring(0, 6 + 1);
        String lastname = Murtaza.substring(8, 14 + 1);
        System.out.println(firstname);
        System.out.println(lastname);

        // TRUE==>String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com"); TRUE
        String gmail = lastname + "_" + firstname + "@gmail.com";//==>TRUE
        System.out.println(gmail);

        String s1 = "I love Java Programming Language";
        //         012345

        String className = s1.substring(7);
        System.out.println(className);               // it start ==> 7
        String s2 = "I like C# Programming";
        s2 = s2.replace("C#", "Java");
        System.out.println(s2);
        String name = "COVID 18";
        name = name.replace("18", "19");//*****TEKRAR CALIS
        System.out.println(name);
        String r1="I like C#, C# is fun, C# is cool";
               r1=r1.replaceFirst("C#","java");
        System.out.println(r1);
        String r2="Tomorrow is Monday, Tomorrow is Tuesday";
               r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);



    }
}


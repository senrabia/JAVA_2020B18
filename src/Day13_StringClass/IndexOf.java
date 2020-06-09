package Day13_StringClass;

public class IndexOf {
    public static void main(String[] args) {
        /*IndexOf (Value): return
        * */
        String str="I like Java programming Jhon";
        int num1=str.indexOf("j");//if we can write Jhon it will give me 27 car.
        System.out.println(num1);
        String str2="Cybertek school is awasome";
        //           0123456789
        int firstS=str.indexOf("s");//9
        int secondS=str2.indexOf("is")+1;
        // str2.indexOf("is")==>returns the index number of i
        System.out.println(firstS);
        System.out.println(secondS);
        int maxIndexnumber="Cybertek".length()-1; //8-1
        System.out.println(maxIndexnumber);
        //What is ? we take ==>NEGATIVE NUMBER
        String names="Muhtar";
                int a1=names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname="Kuzzat Altay";
        String firstName=fullname.substring(0,fullname.indexOf(" "));
        String lastName=fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstName);
        System.out.println(lastName);




    }
}

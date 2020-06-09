package Day25_MethodsRecap;
import Resources.Library2;
public class Test {
    public static void main(String[] args) {
       String str="ABCDABABABAB" ;
       String result= Library2.RemoveDuplicates(str);
        System.out.println(result);  //USED LIBRARY
        String str1="AABBCEB";
        String str2="B";
        int num1= Library2.Frequency(str1,str2);
        System.out.println(num1);
        String str3="MMMMmmjjjjjUUUUUYYYYY";
        String result3= Library2.RemoveDuplicates(str3);
        System.out.println(result3);


    }
}

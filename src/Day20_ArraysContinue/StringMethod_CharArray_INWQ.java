package Day20_ArraysContinue;
import java.util.Arrays;
public class StringMethod_CharArray_INWQ {
    /*String methods related to arry:
    toCharArray():==> returs char array from the string
    String str="Batch 18";
    char[]ch=str.toCharArray();
    */
    public static void main(String[] args) {
        String name="Muhtar";
        char[]characters=name.toCharArray();
        System.out.println(Arrays.toString(characters));

        String str1="Cybertek School";
        String str2="School cybertek";

        char[]ch1=str1.toCharArray();
        char[]ch2=str1.toCharArray();
        //Arrays.sort(ch1);
        //Arrays.sort(ch2);
       System.out.println(Arrays.toString(ch1));
       System.out.println(Arrays.toString(ch2));
        boolean equalStr=Arrays.equals(ch1,ch2);
        System.out.println(equalStr);
        System.out.println("==========================");

        String nameR="rabia";

        char[]ch=nameR.toCharArray(); //Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));




    }

}


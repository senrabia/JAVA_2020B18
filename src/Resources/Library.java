package Resources;

import java.util.Arrays;

public class Library {
//SORT DECENDING==============================
    public static int[] sortDesending(int[] arr) {  //void change INT
    Arrays.sort(arr);  //{1,2,3,4}; ==>{4,3,2,1}
    int[] RevArr = new int[arr.length];

        /*    i//Ingreas j//Decraising
             RevArr[0]= arr[3];
             RevArr[1]=arr[2];
             Revarr[2]=arr[1];
             RevArr[3]=arr[0];
         */
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        RevArr[i] = arr[j];   // If we dont give me j it will work again again
        j--;
    }
    return RevArr;

}
//STRING REVERSE=====================================
    public static String Reverse2(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; ) {
            Reverse += str.charAt(i);
        }
        return Reverse;}
//REMOVE DUPLICATED===================================

public static String RemoveDuplicates(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);     //A
        if (!result.contains("" + ch)) {//result contain or not contain.
            result += ch;
        }
    }return result;

//FREQUENCY==========================================
} public static int Frequency(String str1, String str2) {
    int count = 0;
    while (str1.contains(str2)) {
        count++;
        str1 = str1.replaceFirst(str2, "");
        // we need to make that we are not counting the same index over again
    }
    return count;}
//FREQUENCY OF CHAR====================================
    public static String FrequencyOfChars(String str) {
    String NonDup=Library.RemoveDuplicates(str);
    String result="";
    for( int i=0; i<NonDup.length(); i++){
        String ch=""+NonDup.charAt(i);
        int num=Library.Frequency(str,ch);
        result+=ch+num;
    }
    return result;
}
//UNIQUE==============================================
public static int Frequency(String str, char ch) { // counts the ch' frequency
    char[] arr = str.toCharArray(); // [A, B, B]
    int count = 0; //1
    for (char each : arr) { //3   each: A , B, B
        if (each == ch) {
            count++;
        }
    }
    return count++;
}
public static String uniques(String str){ // "AABCDCD"
    String result = ""; //ACD
    for(int i=0; i < str.length(); i++){
        int num =Frequency(str,str.charAt(i) );
        if( num == 1){
            result += str.charAt(i);
        }
    }
    return result;
}

}





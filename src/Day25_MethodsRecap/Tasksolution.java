package Day25_MethodsRecap;

import java.util.Scanner;

public class Tasksolution {
/*warmup task:
        1.  write a return method that accepts a String and removes duplicate values
         from the String
        Ex:
        RemoveDuplicate("aaabbbccc");  ==> "abc"
        2. write a return method that accepts two strings str1 & str2, and returns
        the frequency of str2 in str1 as an int
        Ex:
        Frequency("AAABB", "A");  ==> 3
        Frequency("ABAB", "B"); ==> 2
        3. (This one I will do it too tomorrow in class) Combine above two methods
         to write a return method that can return the frequencyt of characters as a
          stringfrom any given string
        Ex:
        FrequencyOfChars("ABABCB"); ==> "A2B3C1";
        FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word");
    String str = input.nextLine();
    String nonDup = removeDup(str);
    System.out.println(nonDup);
    System.out.println("===================");
    System.out.println("Enter firs word");
    String str1 = input.nextLine();
    System.out.println("Enter second word");
    String str2 = input.nextLine();
    int count = stringFrequency(str1, str2);
    System.out.println(count);
    System.out.println("====================");
    System.out.println("Enter a  word");
    String str3 = input.nextLine();
    String result = nonDupAndFrequency(str3);
    System.out.println(result);
}

public static String removeDup(String str){
    String nonDup="";
    for(int i=0; i<=str.length()-1; i++){
        for(int j=0; j<=str.length()-1; j++){
        if(nonDup.contains(str.charAt(j)+"")){continue;}
        nonDup+=""+str.charAt(j);}}
        return nonDup;}


        public static int stringFrequency(String str1,String str2){
   int count=0;
   for(int j=0; j<=str1.length()-1; j++){
       for(int i=0; i<=str1.length()-1; i++){
           if(str1.contains(str2)){count++;
           str1=str1.replaceFirst(str2,"");}}}
          return count;
       }


       public static String nonDupAndFrequency(String str){
    String nonDup="";
    String result="";
    for(int i=0; i<=str.length()-1; i++){
        if(!nonDup.contains(""+str.charAt(i))){
            nonDup+=str.charAt(i);}}
    for(int j=0; j<=str.length()-1; j++){
        char ch=nonDup.charAt(j);
    int count=0;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ch){
                count++;}}
        result += "" + ch + count;}return  result;
}
}







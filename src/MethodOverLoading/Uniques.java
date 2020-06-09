package Day26_MethodOverloading.MethodOverLoading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABBBCDB";


        String result = "";  //ACD
        for (int i=0;  i< str.length(); i++) {
            int num = frequency(str, str.charAt(i));//if you used number
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
        String str2 = "Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);
    }

   public static String uniques(String str){
        String result=""; //ACD
        for(int i=0; i<str.length(); i++){
            int num=frequency(str,str.charAt(i));//if you used number
            if(num==1){
           result+=str.charAt(i);
       }}
        return result;

   }


    public static int frequency(String str,char ch){  //counts the ch' frequency
        char[]arr=str.toCharArray(); //[A,B,B]
        int count=0;  //1
        for(char each :arr){  //char each char veriable*
            if(each==ch){
                count++; }

        }
        return count;

    }}


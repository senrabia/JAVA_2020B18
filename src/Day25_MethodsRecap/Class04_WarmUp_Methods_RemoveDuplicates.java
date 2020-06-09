package Day25_MethodsRecap;

public class Class04_WarmUp_Methods_RemoveDuplicates {
    public static void main(String[] args) {

        //FORMULA==>REMOVE DUPLICATED
        String str = "ABABABABAB";
        String result = "";  //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);     //A
            if (!result.contains("" + ch)) {//result contain or not contain.
                result += ch;
            } }//IMPORTANT }} OR }
        System.out.println(result);}
        //====================================
       String str2="ABCABCABC";
      public static String RemoveDuplicates(String str) {
          String result = "";
          for (int i = 0; i < str.length(); i++) {
              char ch = str.charAt(i);     //A
              if (!result.contains("" + ch)) {//result contain or not contain.
                  result += ch;
              }}
              return result;
          }
}



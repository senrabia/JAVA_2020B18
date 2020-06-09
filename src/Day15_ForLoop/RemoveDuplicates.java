package Day15_ForLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "ABAB";
        //          0123
        String result = " "; //"AB" we store the expected result in this variable.

         for (int i = 0; i <= 3; i++) { //UC YERINE ==> STR.LENGTH  baska bir sonuca gider
          /*  if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }*/
            if (result.contains("" + str.charAt(i))) {
                /*if the string result does not contains str.charAt(i), then we concate it to
                * the result , if it does we will*/
                continue;
            }
            result += str.charAt(i);} //only gets executed if str.charAt(i) is not contained in the result.
            System.out.println(result);
        }
    }

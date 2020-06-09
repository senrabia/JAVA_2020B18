package Day16_Loop;

public class Reverse1_ITW_Q {
    public static void main(String[] args) {
        /*write a program that can reverse the following string:
    String str = "Java";
        output: avaJ
        please provide two solutions:
        first solution, you MUST use substring method
        second solution, you MUST use charAt method*/

        String str = "java";
        //   0123
        //"avaJ"
        String Rev = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        String Rev2 = "";
        String Rev3 = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);//same result
        for (int i = 3; i <= 0; i--) {    //                         for(int i=3; i<=0; i--){
            Rev2 += str.charAt(i);    //VEYA==> Rev2+=YERINE    1-System.out.println(""+str.charAt(i));
        }                           //  ikiside kullanilir    2-System.out.println("\n"Rev2);
        System.out.println(Rev);
        System.out.println(Rev2);
        //REVERSED FOR LOOP  ==================================

        int lastIndexnum = str.length() - 1;
        for (int i = lastIndexnum; i >= 0; i--) {
            //System.out.println(str.charAt(i));==>FIRST
            Rev2+=str.charAt(i);}
        System.out.println(Rev2);
        /*write a program to indenfiy if a strinng is palindrom or nit. if yes ==> true,
                                                                     othervise ==> false

         */
        }
    }

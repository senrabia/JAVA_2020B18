package Day10_SwichStatement;

public class days {
    public static void main(String[] args) {
        //MUST USED NESTED IF
        /*Write a program that candiplay the of days based on the number 1-7
         * QUESTION==>Precondition: valid number for the day */

        int num = 3;  //byte if want use// if(num>0 && num<0)
        String result = " ";//if you  have result 2
        String result2 = " ";

        if (num >= 1 && num <= 7) {
            if (num == 1) {
                result = "Monday";
            } else if (num == 2) {
                result = "Tuesday";
            } else if (num == 3) {
                result = "Wednesday";
            } else if (num == 4) {
                result = "Thursday";
            } else if (num == 5) {
                result = "Friday";
            } else if (num == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
        } else {
            result = "invalid";
        }
        //===============================
        /*if (num >= 1 && num <= 7) {.....}else{
            result="Invalid";}*/

        result2 = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" :
                (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : (num == 7) ? "Sunday" : "Invalid";
        //? :7
        //: :6
        System.out.println(result);
        System.out.println(result2);
        //================================
       /* String result3 = "";

        if (num >= 1 && num <= 7) {
            result3 = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" :
                    (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : (num == 7) ? "Sunday";
        } else {result3= "Invalid";}
        System.out.println(result3);*/



    }
}

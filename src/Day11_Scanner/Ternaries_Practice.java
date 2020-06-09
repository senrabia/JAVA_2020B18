package Day11_Scanner;

import java.util.Scanner;

public class Ternaries_Practice {
    public static void main(String[] args) {
        /*200,Ok
          201, Created
          202, Accepted
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter status code: ");
        int statusCode=scan.nextInt();

        String result="";
        if(statusCode==200) {
            result = "Ok";
        }else if(statusCode==201) {
            result = "Created ";}
        else if(statusCode==202) {
            result = "Accepted ";
        }else {result="Invalid status code";}

        System.out.println(result);
        //=======================================================
        //SHORT HAND ==> very useful ELSE IF STATEMENT
        String result2=(statusCode==200)?"Ok":(statusCode==201)?"Created ":
                (statusCode==202)?" Accepted":"Invalid status code";
        System.out.println(result2);





    }
}

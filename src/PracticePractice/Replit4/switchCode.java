package PracticePractice.Replit4;

import java.util.Scanner;

public class switchCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        //WRITE YOUR CODE HERE
        int num=scan.nextInt();
        String result="";
        switch(num){case 200:
            result="OK"; break;            //200, OK
            case 201:
                result="Created"; break;      //201, Created
            case 202:
                result="Accepted"; break;     //202, Accepted
            case 301:
                result="Moved Permanently"; break;    //301, Moved Permanently
            case 303:
                result="See Other"; break;    //303, See Other
            case 304:
                result="Not Modified"; break;    //304, Not Modified
            case 307:
                result="Temporary Redirect"; break;     //307, Temporary Redirect
            case 400:
                result="Bed Request"; break;        //400, Bad Request
            case 401:
                result="Unauthorized"; break;        //401, Unauthorized
            case 403:
                result="Forbidden"; break;           //403, Forbidden
            case 404:
                result="Not Found"; break;           //404, Not Found
            case 410:
                result="Gone"; break;            //410, Gone
            case 500:
                result="Internal Server Error"; break;       //500, Internal Server Error
            case 503:
                result="Servis Unavalible"; break;  //503, Service Unavailable
            default:
                result="Invalid Status Code";}
        System.out.println(result);

    }
}

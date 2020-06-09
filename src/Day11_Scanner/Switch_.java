package Day11_Scanner;

public class Switch_ {
    public static void main(String[] args) {
        /*int statusCode=404;
        switch(statusCode){200, OK
            201, Created
            202, Accepted
            301, Moved Permanently
            303, See Other
            304, Not Modified
            307, Temporary Redirect
            400, Bad Request
            401, Unauthorized
            403, Forbidden
            404, Not Found
            410, Gone
            500, Internal Server Error
            503, Service Unavailable*/
        int statusCode=307;
        //String result=" ";//result kullanmazisek ==> SOPL ile yola devam edebilirsin
        switch(statusCode){
            case 200:
               System.out.println("Ok");
           // result="OK";
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See oteher");
              break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
                default:
                System.out.println("Invalid Status Code");

        }




    }

}

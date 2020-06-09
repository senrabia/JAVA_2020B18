package Day14_StringClass2;

public class WebAdress {
    /* write a program that can validate if a web adress is valid
         valid web adress:
               MUST start with www.
               Must ends with .com, or. edu, .net or .gov
         */
    public static void main(String[] args) {
        String website="www.cybertek.Gov";
               website=website.toLowerCase();
               boolean validEnding=website.endsWith(".com")||website.endsWith(".edu")
                       ||website.endsWith(".gov");



        if(website.startsWith("www.")&&validEnding) {
            System.out.println("Valid adress");       //if(website.endsWith(".com")){
        }else{
            System.out.println("Invalid address");}  // System.out.println(("Valid:started with www."));
        }
    }




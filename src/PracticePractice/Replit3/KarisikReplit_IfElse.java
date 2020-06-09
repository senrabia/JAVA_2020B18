package PracticePractice.Replit3;

import java.util.Scanner;

public class KarisikReplit_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String word1="";
        String word2="";
        if (word1.length() > word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
//================================================================
        //Rep 062. Print first and last letters _String Methods
        String word="";
        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
//================================================================
        //Rep 063. Duplicate it
        System.out.println(word1.concat(word2).concat(word2).concat(word1));
//===============================================================
        //Rep 064. Middle One _ String Methods
        if (word.length()%2 != 0){
            if (word.length()>=3){
                System.out.println(word.charAt(word.length()/2));
            }else{
                System.out.println(word.charAt(0)+""+word.charAt(0)+word.charAt(0));
            }
        }else if (word.length()%2 == 0){
            if (word.length()>=4){
                System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2 ));
            }else{
                System.out.println(word.concat(word));
            }
        }
//==================================================================
        //Rep 065. Middle three _String Methods
        if (word.length() %2 != 0 && word.length() >= 5){
            System.out.println(word.charAt(word.length()/2 -1)
                    +""+ word.charAt(word.length()) + word.charAt(word.length()/2+1));
        }else{
            System.out.println("invalid");
        }
//===================================================================
        //Rep 066. Merge them _ String Methods
        if (word1.length() != 3 || word2.length() != 3 ){
            System.out.println("cannot merge");
        }else{
            System.out.println(word1.charAt(0) +""+ word2.charAt(0) +word1.charAt(1) +""+ word2.charAt(1)+
                    word1.charAt(2) +""+ word2.charAt(2));
        }
//===================================================================
        //Rep 067. Reverse it _ String Methods
        if (word.length() == 5){
            System.out.println(word.charAt(4)+""+word.charAt(3)+word.charAt(2)+""+word.charAt(1)+word.charAt(0));
        }else if(word.length() < 5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }
//===================================================================
        //Rep 069. Print half twice _String Methods
        String firstHalf = word.substring(0,word.length()/2);
        System.out.println(firstHalf.concat(firstHalf));
//===============================================================
        //Rep 070. alejandro I _ String Methods
        String a="";
        if (a.contains("alejandro")){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }
//=================================================================
        //Rep 071. alejandro II _String Methods
        if (a.contains("alejandro") && a.contains("project")){
            System.out.println("read this mail");
        }else {
            System.out.println("dont read");
        }
//==================================================================
        //Rep 072. Email 1 _ String Methods
        if (a.contains("alejandro") && a.contains("project")){
            System.out.println("read this mail");
        }else {
            System.out.println("dont read");
        }
//===================================================================
       // Rep 073. Email 2 _ String Methods

        String email="";

        String first = email.substring(0,email.indexOf("_"));
        first = first.substring(0,1).toUpperCase() +first.substring(1).toLowerCase();
        String last = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        String tDomain = email.substring(email.indexOf(".")+1);
        System.out.println("First name: "+first);
        System.out.println("Last name: "+ last);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+ tDomain);
//==================================================================
        //for loop count down to 0

        for (int n =100 ; n >= 0 ; n--){
            System.out.println(n);
        }
//====================================================================
        //Rep 112. Print 97 * _ Loop
        int k=0;
        for(k=1; k<=97; k++){
            System.out.print("*");
        }
//====================================================================
        //loop calculate sum of number
        int sum=0;
        int n=0;
        for(int i=1 ; i<=n ; i++ ){
            sum += i;
        }
        System.out.print(sum);
//=======================================================================
       // loop calculate multiplied sum of number
        int sum1=0;
        for(int i=1 ; i<=n ; i++ ){
            sum1 += i;
        }
        System.out.print(sum1);
//=======================================================================
        //Rep 074. SMSmessage _String Methods
        String message="";
        String sender="";
        String phoneNumber="";
        String messageBody="";


                sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("Sender: " +sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: "+messageBody);
//=======================================================================
       // Rep 075. Without X_x_String Methods
        String f = ""+word.charAt(0); //first char
        String l = ""+word.charAt(word.length()-1); // last char
        if (f.equalsIgnoreCase("x")&& l.equalsIgnoreCase("x")) {
            word = word.substring(1, word.length() - 1);
        }else if (f.equalsIgnoreCase("x")) {
            word = word.substring(1);
        }else if (l.equalsIgnoreCase("x")) {
            word = word.substring(0, word.length() - 1);
        }else {
            word = word;
        }
        System.out.println(word);
//========================================================================
        //Rep 081. evens_For Loop
        for (int i = 2; i <= 100 ; i +=2){
            if (i%2 == 0){
                System.out.print(i + ", ");
            }
        }
//========================================================================
        //Rep 110. Print * n times _Loop
        int j=0;
        for (j = 1 ; j <= n ; j++){
            System.out.print("*");
        }

    }
}

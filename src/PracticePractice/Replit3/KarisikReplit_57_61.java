package PracticePractice.Replit3;

import java.util.Scanner;

public class KarisikReplit_57_61 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//WRITE YOUR CODE HERE==>61.
        String word1="";
        String word2="";
        String result=(word1.length()>word2.length())? word1:word2;
        System.out.print(result);


//WRITE YOUR CODE HERE==>60
        String word="";
        word=word.substring(word.length()-1);
        System.out.println(word);


//WRITE YOUR CODE HERE==>59
        //with char
        char first=word.charAt(0);
        //with substring
        word=word.substring(0,1);
        System.out.println(word);

//WRITE YOUR CODE HERE==>58
        int length=word.length();
        System.out.println("Length is: "+length);


//WRITE YOUR CODE HERE==>57
        System.out.println("Enter full name:");
        String fName=scan.nextLine();
        if(fName.equalsIgnoreCase("Max Payne") || fName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }


    }
}

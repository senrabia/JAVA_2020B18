package PracticePractice.Replit3;

import java.util.Scanner;

public class JavaPhyton {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava=0;
        int countPython=0;
        while(sentence.contains("java")||sentence.contains("python")){
            if (sentence.contains("java")){
                sentence=sentence.replaceFirst("java","");
                countJava++;
            } else if (sentence.contains("python")){
                sentence=sentence.replaceFirst("python","");
                countPython++;
            }
        }
        if (countJava==countPython){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
}

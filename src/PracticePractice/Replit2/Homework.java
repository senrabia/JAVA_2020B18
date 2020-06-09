package PracticePractice.Replit2;


import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE
        char value='n';
        String result=" ";
        switch(value){
            case 1:
                result= "  Your request is being proccesd is printed "  ;
                break;
            case 2:
                result= " Thank you anyway for your consideration is printed ";
                break;
            case 3:
                result=" Sorry, no help is currently available is printed";
                break;

            default:result=" Invalid entry, please try again!";}
        System.out.println(result);





    }
}

package PracticePractice.Replit2;
import java.util.*;
public class SingleCodeSwitchSt {
public static void main(String[] args) {
  /*  Scanner s = new Scanner(System.in);
    String txt = s.next();
    //your code here
    char ch1=txt.charAt(3);
    char ch2=txt.charAt(5);
    char ch3=txt.charAt(6);

    System.out.println(c);*/

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter command:");
    char response = scan.next().charAt(0);
    //WRITE YOUR CODE HERE

    switch(response){
        case 'y':
            System.out.println(" Your request is being proccesd is printed " ) ;
            break;
        case 'n':
            System.out.println(" Thank you anyway for your consideration is printed ");
            break;
        case 'h':
            System.out.println(" Sorry, no help is currently available is printed");
            break;

        default:System.out.println(" Invallid entry, please try again!");
            break;
    }



}   }

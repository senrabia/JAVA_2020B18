package Day10_SwichStatement;

import javax.print.DocFlavor;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        char ch = 'a';
        String result="";//if ve not use BREAK Statement ABCDInvalid hepsi yazilir
        switch (ch) {
            case 'A':
                System.out.println("A");
                //result="A";//RUULS==>if we use result+="A"
               // break;
            case 'B':
                System.out.println("B");
                //result="B";
                //break;
            case'C':
                System.out.println("C");
                //result="C";
                //break;
            case'D':
                System.out.println("D");
                //result="D";
                //break;
            default:
                System.out.println("Invalid");
                //result="Invalid";
        }
    }
}
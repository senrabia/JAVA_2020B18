package Day9_Nested_If_Ternary;

import java.util.Scanner;
public class Timer {
    public static void main(String[] args){//throw Exception==> between ==>) {<== olmali ama EROR veriyor.
        Scanner scan=new Scanner(System.in);
        //THROW EXCEPTION
        System.out.println("please enter the number of minutes");
        int minutes= scan.nextInt();

        for(int i=minutes;i>0;--i)
            if(i<0)
                break;
            for(int z=59; z>0; --z){
                System.out.println((-1)+"minutes and"+z+"second left");
            }
    }
}

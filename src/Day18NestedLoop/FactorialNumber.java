package Day18NestedLoop;

import java.util.Scanner;

public class FactorialNumber {
    /*2. write a program that can retunr the factorial number of any given number
    Ex:
    input: 5
    output: 120
    because:
            5! = 5 * 4 * 3 * 2* 1 = 120*/

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a number ");
        long num=scan.nextLong();  // int num=scan.nextInt(); //5,4,3,2,1

        long result=1;             // int result=1;     //20  int kullanilabilir
        while(num>=1){
             result*=num;         //result=result*num;
            num--;
        }
        System.out.println(result);
    }

}

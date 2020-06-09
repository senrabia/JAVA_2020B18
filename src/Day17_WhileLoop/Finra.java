package Day17_WhileLoop;

public class Finra {
    public static void main(String[] args) {
        String result = "";
      /*  3. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number.
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
        Ex:
        1 2 FIN 4 RA FIND .... FINRA*/

       for (int i = 1; i <= 30; i++)
        {//prints the numbers that are divisible by both 3&5
            if (i % 3 == 0 && i % 5 == 0) {
                result += " FINRA ";       // System.out.println("FINRA");
            } else if (i % 3 == 0) {     // prints the number that only divisible by3
                result += " FIN ";        //System.out.println("FIN");
            } else if (i % 5 == 0) {     //prints the number that only divisible by5
                result += " RA "; //System.out.println("RA");
            } else { result += i + "";  //System.out.println(i+"");             //prints the number that only divisible by3 or 5}

            }
        }
        System.out.println(result);

    }
    }

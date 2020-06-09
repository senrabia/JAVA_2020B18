package Day7_If_Statem;

public class If_Else_Statements {
    public static void main(String[] args) {
        int num = 0;
        if (num >= 0) {
            System.out.println(num + " is positive");
        }
        if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is negative");
        }
        //OD __EVEN IF statement
        int number = 100;
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
        if (number % 2 != 0) {
            System.out.println(number + "is odd number");
        }
        // _______________________________
        //OD___EVEN IF ELSE statement
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {//otherwise
            System.out.println(number + "is odd number");
        }
        System.out.println("____________________________");
        int age = 30;
        if (age >= 21) {
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }
        System.out.println("____________________________");
        boolean testedPositiveCorona = true;
        if (testedPositiveCorona) {
            System.out.println("Buy more t paper stay home");
        }else{ System.out.println("Come to work");}


    }

    }


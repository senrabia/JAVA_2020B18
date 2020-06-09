package Day18NestedLoop;



import java.util.Scanner;

public class NestedLoopReservePtactice {
    public static void main(String[] args) {
        /*Assignment:
          write program for the room reservation
          //King bed ==> 120$
          //QueenBed ==> 100$
          //SingleBed ==> 80$
          should ask which bedroom do you wanna reserve
          // if user provided invalid entry==>please re-enter.
           calculate the total price
           do you wanna onather room;
           if yes==> repeat the previous steps
           if no==>your total price is: $$$

           if answer either yes or no==> please re-enter   */
           Scanner input = new Scanner(System.in);
                int totalPrice = 0;
                while (true) {
                    System.out.println("Which bedroom do you wanna reserve?");
                    String Answer = input.nextLine();
                    while (!(Answer.equalsIgnoreCase("King Bed") || Answer.equalsIgnoreCase("Queen Bed")
                            || Answer.equalsIgnoreCase("Single Bed"))) {
                        System.out.println("Invalid Type of Bedroom, please re-enter : King Bed or Queen Bed or Single Bed");
                        Answer = input.nextLine();
                    }
                    if (Answer.equalsIgnoreCase("King Bed")) {
                        totalPrice += 120;
                    } else if (Answer.equalsIgnoreCase("Queen Bed")) {
                        totalPrice += 100;
                    } else if (Answer.equalsIgnoreCase("Single Bed")) {
                        totalPrice += 80;
                    }
                    System.out.println("Your total price is: $" + totalPrice);
                    System.out.println("Do you want to reserve another room?");
                    String YesOrNo = input.nextLine();
                    if (YesOrNo.equalsIgnoreCase("yes")) {
                        continue;
                    } else if (YesOrNo.equalsIgnoreCase("no")) {
                        System.out.println("Your total Price is: $" + totalPrice);
                        break;
                    }
                }
            }
        }


       /* int totalPrice = 0;
        while (true) {
            System.out.println("Hi Do you want to reserve bed today.");
            // String answer = input.nextLine();
            double kBed = 120;
            double qBed = 100;
            double sBed = 80;
            String answer = input.nextLine();
            System.out.println("please re-enter Qeen Bed or Single Bed or King Bed");
                    answer=input.next();
            while (!(answer.equalsIgnoreCase("Yes" + "Queen Bed" + qBed + "Single Bed" + sBed + "King Bed" + kBed) ||
                    answer.equalsIgnoreCase("Queen Bed" + qBed + "Single Bed" + sBed) ||
                    answer.equalsIgnoreCase("Queen Bed" + qBed + "Single Bed" + kBed) ||
                    answer.equalsIgnoreCase("Queen Bed" + qBed) ||
                    answer.equalsIgnoreCase("Single Bed" + sBed) ||
                    answer.equalsIgnoreCase("King Bed" + kBed)))
               // System.out.println("please re-enter Qeen Bed or Single Bed or King Bed");
             answer = input.nextLine();


            if (!(answer.equalsIgnoreCase("Yes")) || (answer.equalsIgnoreCase("No")))
                System.out.println("please re-enter yes or no ");
            answer = input.next();
            {
                System.out.println("King bed: " + kBed + "$");
                System.out.println("Queen bed: " + qBed + "$");
                System.out.println("Single bed: " + sBed + "$");
                answer = input.next();


            }
        }
    }  }
*/


















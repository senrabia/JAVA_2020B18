package PracticePractice.Replit4;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mont = scan.nextInt();
        String result = " ";

        switch (mont) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = " April";
                break;
            case 5:
                result = " May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "luly";
                break;
            case 8:
                result = "Agust";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }

        System.out.println(result);
    }
}



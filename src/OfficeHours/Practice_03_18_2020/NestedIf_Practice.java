package OfficeHours.Practice_03_18_2020;

public class NestedIf_Practice {
    /* nested if statement: when we have pre-condition, and precondition can be evaluated to
     multiple senerio.

     */
    public static void main(String[] args) {
        byte weekDays = 8;
        boolean validNumbers = weekDays > 0 && weekDays < 8;
        String result = "";

        if (validNumbers) {
            if (weekDays == 1) {
                result = "Monday";
            } else if (weekDays == 2) {
                result = "Tuesdad";
            } else if (weekDays == 3) {
                result = "Wednesday";
            } else if (weekDays == 4) {
                result = "Thursday";
            } else if (weekDays == 5) {
                result = "Friday";
            } else if (weekDays == 6) {
                result = "Saturday";
            } else {
                result ="Sunday";
            }


        } else {
            System.out.println("Invalid Entry");
        }
    }
}












package Day13_StringClass;

public class StringManHomework {
    public static void main(String[] args) {
         /*Assignmet:
        write me a program that ask the user first and last names, then prints the initials
        EX:
           cybertek
           school
           output:
           CS
         */
         String firstName="cybertek";
         String lastName="school";
         firstName=firstName.substring(0,1).toUpperCase();
         lastName=lastName.substring(0,1).toUpperCase();
        System.out.print(firstName);
        System.out.print(lastName);










    }
}

package Day6_Relation_Op;

public class If_Statement_EV_OD {
    public static void main(String[] args) {
        int a=100;  // 2.nci islem 101
        boolean evenNumber=a %2 ==0;
        // if a number can be devided by 2 without  the reminder.
        boolean oddNumber=a %2 !=1;
        //if the number can not be devided by 2 evenly(esit olarak).
        if (evenNumber){
            System.out.println(a+"is even number");}
        if (oddNumber){
            System.out.println(a+"is odd number");}
        if (!evenNumber){
            System.out.println(a+"is odd number");}
        // if the number is not even number, the it must be odd
        //?? What is the opposite of !odd Number??



    }
}

package Day7_If_Statem;

public class MinNumber {
    public static void main(String[] args) {
        /*3.write a program that accepts three numbers and return the
        minimum number (assume that none of them are equal)
         */
        double a=100;
        double b=200;
        double c=400.5;
        boolean aMin=a<b && a<c; //if a is less than both b and c,then is the minimum
        boolean bMin=b<a && b<c;//if b is less then booth a and c, then b is the minimum
        boolean cMin=c<a && c<b;//if
        if(aMin){
            System.out.println(a+"is the minimum number");}
        if(bMin){
            System.out.println(b+"is the minimum number");}
        if(cMin){
            System.out.println(c+"is the minimum number");}

    }
}

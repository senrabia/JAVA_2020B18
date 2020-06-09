package Day7_If_Statem;

public class MaxNumber {
    public static void main(String[] args) {
        /*2. write java program that accepts three numbers and return
        the maximum number (assume that none of them are equal)
        **This is spesial because you can use if statement*/
        double a=100.5;
        double b=200.5;
        double c=300.5;
        boolean aGreater=a>b && a>c; //if a is grater than both b and c,then a is max.
        boolean bGreater=b>a && b>c;//if b is grater than both a and c,then b is max.
       //NOT WORK_ boolean bGreater=b>a||b>c;//if a is grater than either b and c,then a is max
        boolean cGreater=c>b && c>a; //If c is grater then both number.
        if(aGreater) {
            System.out.println(a+"is grater number");}
        if(bGreater) {
            System.out.println(b+"is grater number");}
        if(cGreater){
            System.out.println(c+"is grater number");}


    }
}

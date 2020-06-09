package OfficeHours.Practice_03_18_2020;

public class Single_IfStatements {
    public static void main(String[] args) {
        //RUULS__
        int a=200;
        int b=200;
        boolean aGreater=a>b;
        boolean bGreater=b>a;
        boolean aEqualB=a==b;
        //boolean aEqualB=aGrater==false && bGreater==false;
        //if a is not greater than and b is not greater than a, that means a==b
        //boolean aEqualB=aGrater==bGreater;
        if(aGreater){
           System.out.println(a+" is greater number");}
        if(bGreater){
            System.out.println(b+" is greater number");}
        if(aGreater==bGreater){
            System.out.println(a+" is equal to "+b);}




    }
}

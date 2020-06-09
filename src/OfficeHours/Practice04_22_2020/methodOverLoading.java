package OfficeHours.Practice04_22_2020;

public class methodOverLoading {
    /* methodOverLoading:multiple method sgharing the same name
    parametre MUST be different(either datatype or number of parameters are different)
    */
    public static void main(String[] args) {
        int num1= method1(20);//"Hello Cybertek", and then retuns 10
        System.out.println(num1);
    }
    public static void method1() {
        System.out.println("Hello Word");
    }
   public static int method1(int a) {
        System.out.println("Hello Cybertek");
        return 10;
    }
    public static void method1(int a, int b) {
        System.out.println("Hello Batch 18");

}

}

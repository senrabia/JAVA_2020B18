package Day25_MethodsRecap;

public class Class02_Return_statement {
    public static void main(String[] args) {
        /* if(10>9){return;} //exist the curent method only.
        System.out.println("Hello");*/
   method1();//return.(intire execusion on the code)
   method2();//system.exit
        System.out.println("Hello");
    }
   public static void method1() {
       if (10 < 9) {
           return;
       }System.out.println("Hello Cybertek");}

   public static void method2() {
        if (10 > 9) { //< isaret boyle ise sout is working
            System.exit(0); //EXIT=> stop the statement.exit status.
        }System.out.println("Hello Cybertek");}


}

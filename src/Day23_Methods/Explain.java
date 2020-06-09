package Day23_Methods;

public class Explain {
      /*
        methods: Grouping series of statements to perform tasks
                 step 1: reverse a string
                 step2:statement
                 step3:statement
                 step4:reverse a string
                 step5:statement
                 benefit:reusable
                 easy to maintain and fix.
     declaration of methods:
                 why parameters: some time , the function
                 Acces-modifier specifier return-type methodName(){
    statementts}
                 Acces modifiers:public, protected, defult, private.
                 specifier:static, final, abstaract,synchronized.
                 return-type:void,any datatype(all primitive & objects)
                 method cannot be declared in another method.
 declarating methods (with parameter):
                 task:1-write a method that can print all odd number bettween1~100
                      2-write a method that can print all odd number bettween1~100

         */

    public static void main(String[] args) {
        dosum( 10, 20 );
        dosum( 10.0, 20.0 );
    }



    public static void dosum(double x, double y) {
        System.out.println("double sum is "+(x+y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int sum is "+(x+y));


    }}
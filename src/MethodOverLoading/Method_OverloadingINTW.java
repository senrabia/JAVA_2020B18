package Day26_MethodOverloading.MethodOverLoading;

public class Method_OverloadingINTW {
    /*method overloading:multiple methods sharing the same name
                        Parameter MUST be differnt (either the datatype or number of parameters)
                  benefits:=>easy to read
                           =>
                           =>easy to remember
                           => very flexible
                           */
    //INTERWIEW QUESTION=> What is the difference between owerloading  and overreading method.

    public static void main(String[] args) {
        method(10);  // original method
        method(10.0);// Overloading method

    }

    public static void method(int a) {
        System.out.println("Original method");

    }

    public static void method(double a) {
        System.out.println("Overloading method");


    }

}


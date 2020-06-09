package Day26_MethodOverloading.MethodOverLoading;

public class OverloadingExercises {
    /*first method: can find the sum of two int numbers
   second: can find the sum of two double numbers
*/


    public static void main(String[] args) {
        sum(10, 5);  // 10,5
        sum(10, 5, 15);  // 10,5,15
    }
public static void sum(int a, int b) {
    System.out.println(a + b);
}
    public static void sum(double a, int b, double c) {
        System.out.println(a + b + c);
    }}
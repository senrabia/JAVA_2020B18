package Day25_MethodsRecap;

public class Class03_Return_methods {
    //a,b
    public static int max(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int max2(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }


    }

}
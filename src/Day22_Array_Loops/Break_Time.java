package Day22_Array_Loops;

public class Break_Time {
    public static void main(String[] args) {
        // 7 8 9 6 0 1 2 3 4 5
        // 5 4 3 2 1 0 6 9 8 7
       // 0 1 2 3 4 5 6 7 8 9


        int[][]numbers={ {7,8,9} , {6} , {1,2,3,4,5}  };

        for(int k=0; k<numbers[0].length; k++) {

            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i] + " ");} }


    }
}

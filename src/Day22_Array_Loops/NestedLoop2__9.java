package Day22_Array_Loops;

public class NestedLoop2__9 {
    public static void main(String[] args) {
        int[][]numbers={ {9,8,7} , {6} , {5,4,3,2,1,0}  };

        /*        k      i
          numbers[0]==>{9,8,7}       number[0][i] i need s to be repeated three times.
          numbers[1]==>{6}           numbers[1][i] i need s to be repeated one times
          numbers[2]==>{5,4,3,2,1,0} number[2][i] i needs to be repeated 6 times.
         */

        for(int k=0; k<numbers[0].length; k++) {

            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i] + " ");
            }

            System.out.println();
        }
        // 7 8 9 6 0 1 2 3 4 5
        // 5 4 3 2 1 0 6 9 8 7
    }   // 0 1 2 3 4 5 6 7 8 9
}

package OfficeHours.Practice_04_15_2020;

public class NestedLoops2__7 {
    public static void main(String[] args) {
        int[][] numbers = {
                {5, 4, 3, 2, 1},
                {10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        //print all the ODD  <== numbers with for loop. MUST use continue statement

        for (int j = 0; j < numbers.length; j++) {     //j:index num of 1D arrays
            for (int i = 0; i < numbers[j].length; i++) {  //i:index num of Elements
                if (numbers[j][i] % 2 == 0) {            //VERY IMPORTANT %2
                    continue;
                }
                System.out.println(numbers[j][i]);
            }
        }
        //print all the EVEN <== number with for each loop.MUST use continue at stements
        for (int[] each1DArray : numbers) {
            for (int eachElement : each1DArray) {
                if (eachElement % 2 != 0) {
                    continue;
                }
                System.out.println(eachElement);
            }

        }
    }
}


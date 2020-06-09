package Day27_DateTime;

public class unique_Arrays {
  /*  METHOD.
		3. write a method that can print out the unique elements from an int array
    Ex: {1,1,2,3,3} ==> 2
    {6,6,7,7,8,9} ==> 8 9
            4. write a method that can print out the unique elements from a double array
    Note: Apply method overloading */

    /*
    3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};  // 2
        //           0  1  2  3  4

//1 WAY=====================================
        for(int i=0; i < arr.length; i++){

            int count = 0 ;
            for(int each   :  arr){
                if(each == arr[i]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }

        }
        System.out.println("==========================");
         int[]arr2={3,3,4,4,5,5,6,7,8,9};
            uniqueElements(arr2);
        System.out.println("==========================");
        double[]arr3={3,3,4,4,5,5,6,7,8,9};
        uniqueElements(arr3);


    }

//2 WAY=================================================
    public static void uniqueElements(int[] arr){

        for(int each2: arr){

            int count = 0 ;
            for(int each   :  arr){
                if(each == each2 ){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each2);
            } }
    }
    //=========================================
    public static void uniqueElements(double[] arr){

        for(double each2: arr) {

            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
            }
            }

            if (count == 1) {
              //  System.out.println(each2);
            }


        }}}
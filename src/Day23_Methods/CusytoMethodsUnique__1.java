package Day23_Methods;

public class CusytoMethodsUnique__1 {
    public static void main(String[] args) {
      /* warmup task:
        1.  Write a program that can print out the unique values from a String Array
        Ex:if arr -> {"A", "A", "B", "C", "C"}
         output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A
                C    MUST use for each loop*/

        String[] arr = {"A", "A", "B", "C", "C", "D", "E"};

        for(String each:arr){  // 3:  A B C
        int count2=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(each)) { count2++;}}
            if(count2==1){ System.out.println(each);}


    }}}




/*
//===============CHECK BOTTOM=====================
      //  for (String each2 : arr) {
          //  int count = 0;

                if (each.equals(each2)) {
                    count++;
                }
                if(count==1)//FIND ALL CHARACTER
                System.out.println(each2);
                //=================ALL=======================
        //for (String each2 : arr) {
            //int count = 0;

            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
                //FIND ALL CHARACTER
                System.out.println(each2);
            }
//==================UNIQUE======================

            for (String each : arr) {
                if (each.equals("B")) {
                    count++;
                }
            }
            if (count == 1) {  //FIND UNIQUE CHAR
                System.out.println("C");
            }

        }
//===============================================


    }
}*/

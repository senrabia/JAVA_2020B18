package Day22_Array_Loops;
import java.util.Arrays;
public class ReverseArray__3 {
    public static void main(String[] args) {
      //  1. write a program that can reverse the array
        int[]arr={1,2,3,4,5};
        for(int i=arr.length-1; i>=0; i--){
            int eachNum=arr[i];
            System.out.println(eachNum);
            System.out.println("=======================");

            //[5,4,3,2,1]
            int[]RevArr=new int[arr.length];  //[0,0,0,0,0]
            //    i1        j
              RevArr[0]=arr[4];
              RevArr[1]=arr[3];
              RevArr[2]=arr[2];
              RevArr[3]=arr[1];
              RevArr[4]=arr[0];

            //System.out.println(Arrays.toString(RevArr));
            int j=arr.length-1;
            for(int i1=0; i1<arr.length; i1++){
               RevArr[i1]=arr[j]; j--;
           }
        }  System.out.println(Arrays.toString(arr));
    }
}

package Day20_ArraysContinue;

public class Max_Min {
    public static void main(String[] args) {
       /* Warmup tasks:
        1. write a program that can find the maximum number from any given int array
        NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
        2. write a program that can find the minimum number from any given int array
        NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE */

       int []arr={2,3,1000,5,6,7,8,9,300,500,750};
       int lastindex=arr.length-1; //RUULS==>
       int max=arr[0];
       int min=arr[0];

       for(int i=0; i<=lastindex;  i++){
           if (arr[i] > max) {     //array's index are compared with each other, and whicever
                                  //is grater will be assigned to the.
               max=arr[i];
           }
           if(arr[i]<min){  //array's index are compared with each other, and whicever
                          //is smaller will be assigned to the.
               min=arr[i];
           }
       }

        System.out.println(max);
        System.out.println(min);



    }
}
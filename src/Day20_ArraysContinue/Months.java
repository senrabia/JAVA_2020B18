package Day20_ArraysContinue;

import java.util.Scanner;

public class Months{
    public static void main(String[] args) {
       /* Array' size is fixed
        Arrays utilities:
        length: returns total number of the elemnt of the array
        Arrays Utilities:
        Arrays class:  presented in "java.util"
                    import PackageName.className;
                    import java.uti.Arrays;
        Arrays.toString(arrayName): converts the array to String, returns the string
        any array with any datatype
        practice task:
        write a program that can combine two arrays of any lengths, and retunr the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7];
        arr3 ==> [1,2,3,4,5,6,7]*/






       String[]months={"Jan", "Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sep","Oct","nov","Dec"};
       /* String[]months2=new String[12];
                 months[0]="Jan";
                 .....
                 .....  */
     /*  int[]n=new int[3];
         n[0]=0;
         n[1]=1;
         n[2]=2;*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
                   int num=input.nextInt();
                   int attempts=0;  //
                   while(num>12||num<=0){
                       System.out.println("Invalid Entry");
                       System.out.println("Please re-enter the number");
                       num=input.nextInt();  //12
                       attempts++;
                       if(attempts==3&&(num>12||num<=0)){
                           System.out.println("invalid Entry , you already have 3 attepmts");
                           System.exit(0);
                       }

                   }
                String result=months[num-1]; //index number, index number start always ==>0
                 /*  String result="";
                  if(num==1){
                      result= months[num-1];*/
        System.out.println(result);


    }

}

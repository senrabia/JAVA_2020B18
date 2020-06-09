package Day10_SwichStatement;

public class daysInMonths {
    /*4. write a program that can find the number of days in a month
      (Assume that Feb has 28 days)
		28 days: 2
        30 days: 4,6, 9, 11
        31 days: 1,3,5,7,8,10,12  ==> MUST USE NESTED IF*/
    public static void main(String[] args) {
        int num=12;
        boolean days28=num==2;
        boolean days30=num==4||num==6||num==9||num==11;
       // boolean days31=num==1||num==3||num==5||num==7||num==8||num==10||num==12;

       String result="";
       if(num>0 && num<13) {
           result=(days28)?"Has 28 days":(days30)?"Has 30 days":"Has 31 days";


       }else{result="invalid";}

        System.out.println(result);









    }



}

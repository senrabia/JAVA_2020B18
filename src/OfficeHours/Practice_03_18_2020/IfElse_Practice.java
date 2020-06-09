package OfficeHours.Practice_03_18_2020;

public class IfElse_Practice {
    public static void main(String[] args) {
       // RUULS==>

   int num=200; //SENERI==>1
       /* if (num%2 !=0){           //ODD condition
            System.out.println(num+"is odd number");}

            if (num%2 !=0){           //EVEN condition
                System.out.println(num+"is odd number");}*/
       //SENERIO==>2
       if(num%2 !=0){
           //ODD condition
           System.out.println(num+"is odd number");}

        else{
            System.out.println(num+"is odd number");}
        //===================================================
        int age=21;
        if(age>=21) {
            System.out.println("You are eligible to buy alcohol");
        } else{
            System.out.println("You are not eligible");}
        //===================================================
        boolean genderMale=true;
        if (genderMale){
            System.out.println("Gender is male ");}
        else{
            System.out.println("Gender is female");}
        //===================================================
        boolean usCitizen=true;
        int ageOfPerson=30;
        if(usCitizen==true && ageOfPerson>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");}






    }
}

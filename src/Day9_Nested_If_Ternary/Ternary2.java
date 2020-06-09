package Day9_Nested_If_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        //____ternary:? means if, _____: means else
        //RUULS__You can use any variable.
        String result=" ";
        if(9>10) {
            result = "9 is grater";
        } else{
            result="10 is grater";}
        String result2=(9>10)?"9 is grater":"10 is grater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("===============================");
        int age=20;
        boolean eligibility=(age>=21)?true:false;
        /*if(age>=21){eligibility=true;
        }else{eligibility=false;}
         */
        System.out.println(eligibility);
        System.out.println("================================");
        int ageOfPerson=20;
        String eligibleToVote=" ";
        if(ageOfPerson>=18){
            eligibleToVote="Yes";
        }else{eligibleToVote="No";}
        String eligibleToVote2=(ageOfPerson>=18) ?"Yes":"No";
        System.out.println(eligibleToVote);
        System.out.println(eligibleToVote2);


















    }
}

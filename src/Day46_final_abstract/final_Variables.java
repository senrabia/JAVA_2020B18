package Day46_final_abstract;
//10:13

public class final_Variables {
   //Final Means: last Value
    final int InstanceVariable=300; //We can not call direcytly INstance method.
    int InstanceVariables2; // Final instance veriables need to be  initialized immedietly.//Basina final yazarsak C.EROR
   final static int staticVariables=1000; //

    public static void main(String[] args) {

        final double PI = 3.14;
        //PI =3.14

        final String gender = "Male";
        //   gender ="Female";
        final int score; //One time it give me
        score=100;
       // score=200; //Eror
        System.out.println(score);
        System.out.println("==========================");
        //this.InstanceVariable=400;
        final_Variables obj= new final_Variables(); //Burda InstanceVariable calismiyor.
        //obj.InstanceVariable=400;
       // staticVariables=2000;

    }
}
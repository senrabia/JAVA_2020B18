package Day7_If_Statem;

public class ValidTriangle {
    public static void main(String[] args) {
        short angle1=30;      //30.5 you vill try
        short angle2=50;      //49.5 you will try
        short angle3=60;      //100  you vill try
        //int sumOfAngles=angle1+angle2+angle3; it is work.
        short sumOfAngles=(short)(angle1+angle2+angle3);
        //**short sumOfAngles=(int not work)(byt not vork)(short work)angle1+angle2+angle3;
        //if you use not int short this not compiled.
        boolean validTriangle=sumOfAngles==180;
        if(validTriangle){//sumOfAngles==180 it can be
            System.out.println("The shape is a triangle");}
        if(!validTriangle){//sumOfAngles!=180; it can be
            System.out.println("The shape is not a valid triangle");}




    }
}

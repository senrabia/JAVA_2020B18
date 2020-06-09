package Day38_Constructor;

import java.text.DecimalFormat;
import java.util.Scanner;
//--5
public class CircleObject {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner scan=new Scanner(System.in); //2 solution==>scanner kullanarak
        double r =scan.nextDouble();

        //double r=3;   //1 solution ==>just double used...
        Circle circle1=new Circle(r);
        double areaOfCircle=circle1.area();
        System.out.println("Diameter is:"+areaOfCircle);
        System.out.println("Perimeter is:"+circle1.perimeter());
        System.out.println("Area is:"+df.format(areaOfCircle));
    }
}

package Day43_Overriding;
//10:24
/*2. create sub classes of Shape:
                Circle
                rectangle
                square
    ================================================
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */
public class Circle extends Shape {
   public double radius;
   public static double PI=3.14;

   public Circle(double radius){
       this.radius=radius; }
       /*    calculateArea & calculatePrimeter         */

       public void calculateArea(){
           area=radius*radius*PI;
           System.out.println("Area of the Cicle: "+area);

       }
       public void calculatePrimeter(){
           perimeter=radius*2*PI;
           System.out.println("Primeter of the circle: "+perimeter);
       }
   }




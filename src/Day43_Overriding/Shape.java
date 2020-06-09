package Day43_Overriding;
//10:16
/*1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
 ===========================================================
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */
public class Shape {
    public double area;
    public double perimeter;

    protected void calculateArea(){
        System.out.println("Area of the shape: "+0);
        area = 0;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of the shape: "+0);
        perimeter = 0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }


}
package Day43_Overriding;
//10:30

public class Rectangle extends Shape {
    /* inherited:
    area, perimeter
    calculateArea(), CalculatePrimeter()
     */
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;

    }
    public void calculateArea(){
      area=length* width;
        System.out.println("Area of the Rectangle: "+area);
    }
    public void calculatePerimeter(){
        perimeter=(width + length)*2;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}

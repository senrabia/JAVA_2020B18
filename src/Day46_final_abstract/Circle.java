package Day46_final_abstract;
//15:30

public final class Circle extends Shape { //absrtact ta burda calisir

    public double radius;
    public final static double PI = 3.14;

    public Circle (double radius){
    this.radius=radius;
    }


    public void Area(){
        double area=radius * radius * PI;
        System.out.println("Area of circle:"+ area);


    }
}

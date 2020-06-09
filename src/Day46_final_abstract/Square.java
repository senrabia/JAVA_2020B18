package Day46_final_abstract;
//16:00
public class Square extends Shape {

 public double side;

 public Square(double side){
  this.side= side;
 }

  public void Area (){
  double area= side * side;
  System.out.println("Area of square: "+area);
 }


}

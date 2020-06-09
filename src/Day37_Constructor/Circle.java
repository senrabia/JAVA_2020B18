package Day37_Constructor;

public class Circle {
  /*  Create a class called Circle
            instance variables:
    radius, pi, diameter
    add a constructor that can initialize the radius of the circle

    instance methods:
    area(): can return the area of the circle as double
    perimeter(): cna return the perimeter of the circle as double
    toString(): returns the info of the circle

    Note: global value of PI is 3.14
    diameter of circle = 2 * radius
    area of circle = PI * r * r   */

  double radius;
  double PI= 3.14;  // pi value 3.14
  double diameter;


  public Circle(double radius){
    this.radius= radius;
    diameter = 2*radius;
  }

  public double perimeter(){//instance method two
    diameter = 2*radius; //
    double perimeter = diameter*PI;
    return perimeter;
  }

  public double area(){//instance one
    return PI*radius*radius;
  }
  public String toString(){  //instance method three
    return "radius: "+radius+", diameter: "+diameter+", area: "+area()+", perimeter: "+perimeter();
  }
}

class CircleObje{
  public static void main(String[] args) {
    Circle obje = new Circle(4);
    System.out.println(obje);
    Circle obje2 = new Circle(3.5);
    System.out.println(obje2);
  }
}

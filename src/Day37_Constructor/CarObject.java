package Day37_Constructor;
//--4 object
public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car("Mazda","6",2019,20_000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);


        Car Car2=new Car("Honda","CIVIC",2020,28000);
        System.out.println(Car2);
    }
}

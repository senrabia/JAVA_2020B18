package Day39_AccesModifiers;
//--1
public class CarObjects {
    public static void main(String[] args) {
        //new Constructorr
        Car car1=new Car(" Toyota ");  //Line 21
        System.out.println(car1);
        Car car2=new Car(" BMW "," X6 ");//line 25
        System.out.println(car2);
        Car car3=new Car(" Lexus "," RX ",2020);//line 30
        System.out.println(car3);
        Car car4=new Car(" Tesla "," Model 3 ",2020,40000);//line 33
        System.out.println(car4);

    }
}

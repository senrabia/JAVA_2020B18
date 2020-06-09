package Day33_CustomMethod_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject2 {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setCarInfo("BMW","XC",2020,"White");
        car1.getCarInfo(); // sout kullanmadan result
//===================================================
        Car car2= new Car();
        car2.setCarInfo("Toyoeta","Corolla",2020,"Black");
        car2.getCarInfo();// sout kullanmadan result

//===============  TOO LONG =================================
        Car car3= new Car();
        car3.Brand="Toyota";
        car3.year=2020;
        car3.color="Darkblue";
        car3.getCarInfo();  //Sout kullanmadan result
//============================================================
         Car car4=new Car();
         car4.setCarInfo("Audi","Q7",2019,"Grey");
         car4.getCarInfo();
        System.out.println("===================================");
//=================  REGULAR FOR LOOP ==========================
        Car[] cars={car1,car2,car3, car4};
    for(int i=0; i<cars.length; i++){
        cars[i].getCarInfo();
        System.out.println("===================================");
//================ EACH LOOP  ===============================
    for (Car eachCar: cars) {
      eachCar.getCarInfo();
      System.out.println("======================================");
      System.out.println(car1);

      ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
      System.out.println(list1);// to String method get executed automatically
  }

    }
   // String []arr ={"A","B", 123}; eror

    }
}

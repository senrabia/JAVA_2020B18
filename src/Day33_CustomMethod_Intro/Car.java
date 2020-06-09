package Day33_CustomMethod_Intro;
//Instance variable: object veriables
//declare variable: variables that are declare outside a block
//local variable: variables that are declared within a block

public class Car {
    String Brand;
    String model;
    int year;
    String color;

   // public static void main(String[] args) {

        public void start(){

            System.out.println(Brand+" is started");
        }
        public void drive(){
            System.out.println("Driving "+Brand+" "+model);
        }
        public void getCarInfo(){

            System.out.println(year+" "+Brand+" " +model+" "+color);
        }
        public void setCarInfo(String carBrand, String carModel,int carYear,String carColor) {
            Brand = carBrand;
            model = carModel;
            year = carYear;
            color = carColor;}
            //========================================
    //what ever do you vant print at you can used.
    /* IMPORTANT EXPLAIN
    remmeber if they were only passing object name in print statement without calling any other methods , then you will have to have the toString method
method name it said asString, they manually called it, if it was toString no need to call for manuually


     */
            public String toString () {
                String result = year + " " + Brand + " " + model + " " + color;
                return result;
            }

      public static void main(String[] args) {
        int a=100; //local veriables}
    }

        }






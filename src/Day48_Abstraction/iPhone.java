package Day48_Abstraction;

public class iPhone extends Phone {
       static{
        brand="phone";}  //There is just 1 copy . This is not useful

    public iPhone(String model, double price, String size){
        // brand = "iPhone"; //There is many copy
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting with "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }

}
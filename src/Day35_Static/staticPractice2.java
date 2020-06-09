package Day35_Static;

public class staticPractice2 {
   /*Static only ACCEPT static
     */

    String brand;
    String Model;
    static boolean hasWheels = true;

    public void printBrand() {
        System.out.println(brand);
    }

    public void printModel() {
        System.out.println(Model);
    }

    public static void main(String[] args) {
        System.out.println(hasWheels);
    }
}


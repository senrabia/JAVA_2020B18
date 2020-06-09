package Day44_Exceptions;
//12:35
public class ExceptionHandling {
    //IMPORTANT: e.getMessage hata nerde bulunmasini kolaylastiriyor.
    public static void main(String[] args) {
        String str="Cybertek";
        try{
            System.out.println(str.charAt(100));

        }catch(RuntimeException e){

          String discription = e.getMessage();
            System.out.println(discription);
        }
        System.out.println("========================");
        String result=" ";
        try{
            System.out.println(100/0);
            System.out.println("Try Block");

        }catch(ArithmeticException e){
         System.out.println("Catch Block");
         String description=e.getMessage();
         System.out.println(description);
        }
         System.out.println(result);
         System.out.println("Completed");

    }
}

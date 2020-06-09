package Day44_Exceptions;
//12:15
public class try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            Thread.sleep(3000); //3000 salise sonra goruntu geliyor


        }catch (Exception e){
            System.out.println("Catch block");
        }
        System.out.println("Word");
    }
}

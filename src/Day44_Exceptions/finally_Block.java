package Day44_Exceptions;

public class finally_Block {
    public static void main(String[] args) {
        try{
            System.out.println(9/0); //Kendinden sonrakini yine calistirmadi
            System.out.println("Try Block");
        }catch(Exception e){         //(NoSuchElementException e){
            System.out.println("catch Block");
        }finally{
            System.out.println("Finnaly");
        }
    }
}

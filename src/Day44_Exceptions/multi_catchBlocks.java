package Day44_Exceptions;
//14:00
import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0); //Aritmetic
        } catch (ClassCastException e) {
            System.out.println("Class Cast");
        } catch (NoSuchElementException e) {
            System.out.println("No such element");
        }/*catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound");} */
        catch (ArithmeticException e) {
            System.out.println("Aritmetic");}//Autput is OTOMATIK
        catch (RuntimeException e) {
            System.out.println("Runtime"); }
        catch (Exception e){
            System.out.println("Exception");}

    }
}
//-Multi Catc Block
package Day44_Exceptions;
//11:20
import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));

       try{ System.out.println(list.get(10));

       }catch(Exception e) {  //NOT a yerine hersey yazilabilir
          /*IMPORTANT EXPLAIN
          1.IndexOutOfBoundsException runn etttikten sonra cikan kirmizi yazi ayni zamanda
          ismi Tablodaki SuperClass tan aliyor.
          2.EXCEPTION hepsinin superClass i oldugu icin yazildiginda hepsini cover ediyor.
          3ilki kesin ikincisi yani  e.. istedigini vereboilirsin

         */
            System.out.println("Something went wrong");
        }//buraya yazdiginida out ediyor ama burdaki sadece en ust ve alttakini RUN ediyor.

        System.out.println("Test completed");
    }
    }


package Day10_SwichStatement;
import java.util.Scanner;     //UTIl in yanina NAME OF THE CLASS
public class ScannerClass {
    /*Scanner Class: has the methods to help us to get the user input
    -present  in "java.util" package
    -in order to use the scanner first we will have to IMPORT IT :
                                   syntax: import pckageName.className;
                                   import java.util.Scanner
   - import statement MUST be places between CLASS NAME and PACKAGE NAME:
       package A;
       public clasB{

       }
       ==>declare scanner:
       Scanner veriableName=new Scanner(System.in);
       veriableName:will be reference to scanner object
       tought veriableName we can call the mehods of scanner
      - methods of Scanner:nextByte():allows  user to enter bytevalue, takes it as byte primitive.
                           nextShort():allows user to enter short number, takes it as short primitive.
                           nextInt():allows user to enter int number, takes it as int bprimitive.
      input.nextByte(); ****Asagidaki Ornek==>BYTE METHOD


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number:");
        byte num1 = input.nextByte();
        System.out.println("You have entered" + num1); //12//This need concatination add"You have aenterd"
        if (num1 % 2 == 0) {
            System.out.println(num1 + "is even number");
        }else{
            System.out.println(num1+"is odd number");}
    }

    }



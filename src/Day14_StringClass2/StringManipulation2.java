package Day14_StringClass2;

public class StringManipulation2 {
    public static void main(String[] args) {
        /*    METHOD==> Is EmptyMetod:
 isEmpty():indentifies if the string is empty
         true==>string is empty
         false==>String is not empty
              EQUAL M==>
         equal(str):checks is two string' visible text are equal or not.

         */
          String str=" ";
          boolean bool1=str.isEmpty();
        System.out.println(bool1);

        String username="";
          if (username.isEmpty()) {
              System.out.println("please provide the user name first");
          }
          String s1="Cat"; //String literal
          String s2=new String("cat");
        System.out.println(s1==s2);          // false, different memory location, different
        System.out.println(s1.equals(s2));   //True

        String z1="tiger";
        String z2=new String("Tiger");
        String z3="Tiger";
        String z4="tiger";
        //==
        System.out.println(z1==z2);  //false
        System.out.println(z2==z3);  // false
        System.out.println(z1==z3);  //true, same object
       //equals();
        System.out.println(z1.equals(z2)); //true
        System.out.println(z2.equals(z3)); //true new
        System.out.println(z1.equals(z1)); //true
        System.out.println(z3.equals(z4));  //false








    }
}
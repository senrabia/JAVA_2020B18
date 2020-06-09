package Day44_Exceptions;

//15:25
public class Practice {
    public static void main(String[] args) {
    /*
    print hello
    wait two seconds
    print Cybertek
    wait three second
    java
     */
        System.out.println("Hello");
        try{
            Thread.sleep(2000);
        }catch(Exception e){ }
        System.out.println("Cybertek");
        try {
            Thread.sleep(3000);
        }catch(Exception e){

        }
}}

package Day44_Exceptions;
//15:30 NOT SELENYUM DA EN COK KULLANILAN CODE LARDAN BIRI
public class Practice2 {

    public static void main(String[] args) {
        System.out.println("java");
        waits(5);
        System.out.println("Cybertek");}


        public static void waits(double seconds) {
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (Exception e) {
        }
    }
}
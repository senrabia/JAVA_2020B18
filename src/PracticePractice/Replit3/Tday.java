package PracticePractice.Replit3;

public class Tday {

    public static String c_profits(int buyPrice, int sellPrice) {
      //  /public static String c_profits ( int buyPrice, int sellPrice){
            //your code here
            String a = "";
            if (buyPrice > sellPrice) {
                a = "loss";
            } else if (buyPrice < sellPrice) {
                a = "profit";
            } else {
                a = "no loss";
            }
            return a;
        }
      /*  public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            int buyPrice = s.nextInt();
            int sellPrice = s.nextInt();
            String b = c_profits(buyPrice, sellPrice);
            System.out.println(b);
        }*/

    }
package KizlarCaySaati;

public class Reverse {
    public static void main(String[] args) {
        String name = Reverse("rabia");
        System.out.println(name);
    }

    public static String Reverse(String str) {
        String Reverse="";
        for(int i=str.length()-1; i>=0; i--){
            Reverse+=str.charAt(i);}
        return Reverse;

    }
}

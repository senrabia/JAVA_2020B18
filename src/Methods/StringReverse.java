package Day24_Methods.Methods;

public class StringReverse {
    public static void main(String[] args) {
        //  String t=Reverse("Cybertek");
        String name = Reverse2("Cybertek");
    }

    public static void Reverse(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; ) {
            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);


    }

    public static String Reverse2(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; ) {
            Reverse += str.charAt(i);
        }
        return Reverse;


    }
}


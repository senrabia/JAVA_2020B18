package Day18NestedLoop;

public class StringeReverse {
    public static void main(String[] args) {
        String str = "I like Java";
        String rev = " ";

        int lastIndex = str.length() - 1;

        do { rev += str.charAt(lastIndex);
           lastIndex--;
        } while (lastIndex >= 0);
        System.out.println(rev);



    }
}

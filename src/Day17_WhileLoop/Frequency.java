package Day17_WhileLoop;

public class Frequency {
    public static void main(String[] args) {

        String str="Cybertek School is a great place to study".toLowerCase();//is fun, is cool
       int count=0; //1+1+1

       String word="s".toLowerCase();
       while(str.contains(word)) {
           count++;
           str = str.replaceFirst(word, "");//after counting the first
           //"java" we need to remove from.
       }
        System.out.println(count);

       }

    }


package Day17_WhileLoop;

public class AkasamPractice {
    public static void main(String[] args) {
      /*  for(int i=0; i<=10; i++){
            System.out.println(i );}*/
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            System.out.print(ch1 + " ");
        }
        System.out.println(" ");
        for (char ch2 = 'z'; ch2 >= 'a'; ch2--) {
            System.out.print(ch2 + " ");
        }
        System.out.println(" ");
        for (int elma = 0; elma <= 50; elma++) {
            if (elma % 2 == 0) {
                System.out.print(elma + " ");
            }
        }

            System.out.println(" ");
            for (int elma1 = 0; elma1 <= 50; elma1++) {
                if (elma1 % 2 != 0) {
                    System.out.print(elma1 + " elma ");
                }

            }

        }
}





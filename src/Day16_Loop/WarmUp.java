package Day16_Loop;

public class WarmUp {
    public static void main(String[] args) {
        /*Warmup Task :Use for loop
        1. Write a Java program that can count how many time the word
     "book" is apperated in a String.
        Ex:
        input: I like books, I have books, I need book.
        Output:3*/
        String sentence = "I like books, I have books, I need book";
        //        index:        i, i+3+1==>book
        int count = 0;      //Only need Substring.
        for (int i = 0; i < sentence.length() - 3; i++) {
            //       16    17
            if (sentence.substring(i, i + 4).equals("book")) ;
            //substring(0,4)
            count++;
        }
        System.out.println(count);

         String sentence1 = "I like books, I have books, I need book, I buy books";
        // Do it one more time;

        int count1 = 0;
        for (int z = 0; z < sentence1.length()-3; z++) {
            if (sentence.substring(z, z+4).equals("book"))
                 //                0, 4
                 //                1, 5
                //                2, 6  it continiu max index num.
                count1++;
        }
        System.out.println(count1);
        String words3="Cybertek is school, Cybertek is great, I love Cybertek";
        //              i,  i+7
        //substring (i, i+7+1) ending index is excluded in substring
        int nTimes=0;
        for(int i=0; i<words3.length()-5-1-1; i++) {
            if (words3.substring(i, i+8).equals("Cybertek")){
                nTimes++;
            }


        }
        System.out.println(nTimes++);
    }


}

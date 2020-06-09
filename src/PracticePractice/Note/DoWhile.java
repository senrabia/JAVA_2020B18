package PracticePractice.Note;

public class DoWhile {
    public static void main(String[] args) {
        /*print all the even number 0~100 in the same line sepereted by a space.
         */
        int num = 0;
        do {
            if (num % 2 != 0)  // break; it can be use.
                System.out.print(num + " ");
            num++;
        } while (num <= 100);


        System.out.println("\n=======================");
        int i = 1;
        do {
            i++;
            System.out.print(i + " ");
        }// i++;}
        while (i <= 5);



        System.out.println("\n=======================");
        int z = 1;
        do { System.out.println(z);
            z++;}
        while (z <= 5);



        System.out.println("\n========================");
        int y=1;
        do{if(y==3){ //y++; //need to make sure that the iterator is not skipping, so
            //that the condition will e ventually be false
            continue;}
            System.out.println(y);y++;}
        while(y<=5);


        System.out.println("\n========================");
        int t=1;
        do{ if(t%2 !=0){t++; continue;}
            System.out.print(t+" "); t++;}
        while(t<=100);

    }
}






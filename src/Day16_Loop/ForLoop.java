package Day16_Loop;

public class ForLoop {
    public static void main(String[] args) {
        /*=>FOR==>for loop(initilizasion;condition;iterator){
                          (basalatma;sart;yenileyici)
        Statements that we repeat.}
        statements witin loops body is repait it until condition becomes false.
           ==> initilization: usually thee times of the number that we wanna execute the loop
               Starting point
                Ex:int i=0;
           ==> condition:condition is created based on the initilization.
               Ex:i<10
           ==> iterator: co-related to the condition, runs long enough and either increases or
          decreases the value of initialization, then eventually condition becomes false
          Ex: i++, i++, i+=2....
           MUST BE CAPABLE ENOUGHT TO MAKE THE CONDITION FALSE
           ITERATOR IS NOT MANDATORY
           if we dont give iterator , we will not get compile error, but we will get logical eror.

           in the loop, as long as condition true, it gets executed , only stops
           when condition become false.
         */

        // for (int i=0; i<=2; i--){
        // System.out.println("Hello Word "+i);}
        //Task01:

        for (int i = 1; i <= 100; i++) {  // i++:1,2,3,4,5,6,7,8,9,10
                                          //i+=2:1, 3, 5, 7, 9, 11
            System.out.println(i);

            System.out.print(" the square of" + i + "is: " + (i * i));
        }

        //Task02:
        for (int i = 1; i <= 32; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Task03:
        for (int i = 1; i <=10; i+=1) {
            if (i % 2 != 1) {
                System.out.print(i + " ");
            }
        }

    }

}
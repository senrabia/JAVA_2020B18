package OfficeHours.Practice04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
        /*print all the numbers between 0~100 that can be divisible by 3 or five
         */

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0)

                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("=======================");

        //          123456 LENGTH=>

        String name = "Anna";
        //int data type==>012345   IDEX=>number always start 0 <=
        String result = "";
        int lastIndex = name.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            result += name.charAt(i);
            //result=result+name.substring(i,i+1);
            //                             3,4
        }   //                             2,3
        System.out.print(result);
        if (name.equalsIgnoreCase(result)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }

       // }else{
            System.out.println("if the name is empty");
        }
    }


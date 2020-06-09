package Home_Work;


import java.util.Scanner;

public class javapython {
    public static void main(String[] args) {




        /*Given a string word, print true if "java" appears starting at
        index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
         The string may be any length, including 0word = .
    Example:
   input: javapython
   output: true

   Example:
  input: cjavac++
  output: true


  Example:
  input: c#javaruby
 output: false

         */
        boolean exists = true;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.contains("java") && (word.substring(0,4).equalsIgnoreCase("java")
                || word.substring(1,5).equalsIgnoreCase("java"))) {
            //burdaki && isareti java ve devamindaki kelime true olmali
            exists = true;
        }else{
            exists = false;
        }

        }

    }




package Day22_Array_Loops;

public class Java_Python__5 {
    public static void main(String[] args) {
      /*//SPLIT DEVREYE GIRDI BURDA
       1. write a program that can return the number of appearances of "java"
    and "python" anywhere in the sentence
        (it's similar to the task 97 in repl.it, But this time you MUST use
    arrays and for each loop)*/

        String sentence="I like java and javascript";

        sentence=sentence.toLowerCase();
        sentence=sentence.toUpperCase();

        int countJava=0;//2
        int countPhyton=0;
        String[]words=sentence.split(" ");//[I,like, java, and, javascript]

        for(String each:words){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPhyton++;
            }
        } System.out.println(countJava);
          System.out.println(countPhyton);
          System.out.println(countJava==countPhyton);  //result false





    }
}

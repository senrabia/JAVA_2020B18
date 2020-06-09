package Day21_MultiDeminasionalArray;

public class Lorgest_Shortest_Word {
    public static void main(String[] args) {
         /* 1.write a program that can return the logest string of text from an array
            2.write a program that can return the shortest string of text from an array*/


        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};
        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();
        String longestword="";
        String shortestWord="";

        for(int i=1; i<=names.length-1; i++){
            if (names[i].length()>maxLengthString){
                maxLengthString=names[i].length();
                longestword=names[i];

            }
            if (names[i].length()<minLengthString){
                minLengthString=names[i].length();
                shortestWord=names[i];


            }}
        System.out.println(longestword);
            System.out.println(shortestWord);
        //System.out.println("=====================");
        }}
       /*
        int minLengthString = names[0].length(); //4
        String shortestWord="";

        for(int i=1; i<=names.length-1; i++){
            if (names[i].length()>minLengthString){
                minLengthString=names[i].length();
                shortestWord=names[i]
                 } }
        System.out.println(longestword);
            }}*/
package OfficeHours.Practice_04_15_2020;

public class NestedLoops__6 {
    public static void main(String[] args) {
        //<= used it can be used -1
        //(arr2D[0][i])
       //What kind of variable that give me. eachCharArray

     char[][]arr2D={{'A','B'},{'C','D','E'},{'F','j','H'}};

     //LastBody  V=============
        for(int j=0;  j<arr2D.length; j++)//j; index nums of the 1D arrays

     //firstBody V=========i<arr2D[2] two change for ==>j
     for(int i=0;  i<arr2D[j].length; i++){ //i: index num of elements in 1D  *** 1<= used it can be used -1

         System.out.println(arr2D[j][i]);}

        System.out.println("===============================");
       // arr2D={{'A','B'},{'C','D','E'},{'F','j','H'}};

        for(char[]each1DArray :arr2D){           //single array
            for(char eachElement:each1DArray){   //single char
                System.out.print(eachElement+" ");
            }
        }

        }
    }


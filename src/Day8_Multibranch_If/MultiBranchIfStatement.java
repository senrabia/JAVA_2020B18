package Day8_Multibranch_If;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        /*ONLY ONE OF THE BLOCK GETS EXECUTED*/
        //___HERSEY DOUBLE SCORE BAGLI

        double score=70.5;//max score is is 100
        //please
        //if use float score=95.5 __f__kullan.
        boolean AGrade=score>=90 && score<=100;
        boolean BGrade=score>=80 && score <90;
        boolean CGrade=score>=70 && score <80;
        boolean DGrade=score>=60 && score <70;
        System.out.println("==============================");
        char grade='A';  // WERY IMPORTANT STATAMENT
        String Grade ="";// String Statementlerde kullanilir.
       // System.out.println("");

        if ("A"==Grade){grade='A';}

            else if("B"==Grade){grade='B';}

                else if("C"==Grade){grade='C';}

                    else if("D"==Grade){grade='D';}

                        else{grade='F';}
        System.out.println(grade);
        System.out.println("Score: "+score+" is: "+grade);
    }
}









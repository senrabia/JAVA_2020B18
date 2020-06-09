package Day8_Multibranch_If;

public class multiBranchif {
    public static void main(String[] args) {
        /* if(cond){statement1}
              else if(cond){statement2}
                  else if(cond){statement3}
                      else{//other wise statement3}
         ___ ONLY ONE OF THE BLOCK GETS EXECUTED
         ___ IF BOTH OF JUST FIRST CONDITION WORK.
         ___iF ALL CONDITION ARE FAILED THIS ONE
         */
         int a=100;
        /*boolean zero= a==0;
        boolean negative=a<0;
        boolean positive=a>0;

        if (zero) { System.out.println("zero");}
        if(negative){ System.out.println("negative");}
        if(positive){ System.out.println("positive");}*/
if(a==0){ System.out.println("zero");}
   else if(a>0){System.out.println("positive");}
   else {System.out.println("negative");}





    }
}











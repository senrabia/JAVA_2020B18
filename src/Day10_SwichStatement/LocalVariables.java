package Day10_SwichStatement;

public class LocalVariables{
    public static void main(String[] args) {
       /*int a;  //This is local veriable
        veriables that are declareted with in the block
        -Connat be used outside its the  block
         -MUST be initilaized before we use them*/
       //declare veriable: DataType variable

    int a=0;
    if(true) {
        System.out.println(a);
        int b=10;


        }
    //System.out,println(b);Local variable cannat be used outside its block
        switch(3) {
            case 1:
                int c = 100;
            case 2:
                //System.out,println(b);The local variable c blongs to the caseblock 1
        }
//System.out.println(c);
        if(9>10) {
            int t = 100;
        }else if(12>10){
            int t=100;
            System.out.println(t);
        }
        //System.out.println(t);//Give me a EROR because autside block
    }
}

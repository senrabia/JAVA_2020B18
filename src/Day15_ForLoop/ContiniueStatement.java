package Day15_ForLoop;



public class ContiniueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){  //i:1,2,3,4,5
            if(i==3){continue;}
            System.out.println(i);
        }
        for( int i=0; i<=20; i++){
            if(i%2 !=0){continue;}
            /*if(i%2==0) {continiu}*/
            System.out.println(i+" ");
        }

        }


    }


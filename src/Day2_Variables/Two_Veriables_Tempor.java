package Day2_Variables;

public class Two_Veriables_Tempor {
    public static void main(String[]args){
        int a=10;
        int b=15;
        //temporary
        int temp=a;
              a=b;
              b=temp;
              System.out.println(a);
              System.out.println(b);



    }

}

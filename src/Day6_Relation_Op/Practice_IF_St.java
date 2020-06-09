package Day6_Relation_Op;

public class Practice_IF_St {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        if(a>b){
            System.out.println(a+"is grater then"+b);}
        if (b>a){
            System.out.println(b+"is grater then"+a);}
        if(a==b){
            System.out.println(a+"is equal to"+b);}
        System.out.println("___________________________");
            //if(a>b&&b>a&&a==b){
            // System.out.println(a+"&&"+b+" "+b+"&&"+a+" "+a+"=="+b);
        int x=200;
        int y=300;
        boolean xGrater=x>y;
        boolean yGrater=y>x;
        if (xGrater){
            System.out.println(y+"is grater then"+x);}
        if (yGrater) {
            System.out.println(x+"is grater then"+y);

        }

    }
}

package Day7_If_Statem;

public class MidiumNumber {
    public static void main(String[] args) {
        /*4.write java program three numbers and return the midium number
        (assume that none of them are equal)
         */
        double a=100;
        double b=200;
        double c=300;
        /* a:if (a<b && a>c) or (a>b && a<c)
           b:if (b<c && b>a) or(b>c && b<a)
           c:if (c<b && c>a) or (c>b && c<a)  */
        boolean aMedium= (a<b && a>c) || (a>b && a<c);
        //b< a< c    or   c< a< b
        boolean bMedium=(b<c && b>a) || (b>c && b<a);
        //c< b< a    or  a< b< c
        boolean cMedium=(c<b && c>a) || (c>b && c<a);
        // a< c< b   or  b< c< a<
        if (aMedium){
            System.out.println(a+"a is the midium number");}
        if(bMedium){
            System.out.println(b+"is the midium number");}
        if(cMedium){
            System.out.println(c+"is the medium number");}

        }

    }


package Day6_Relation_Op;

public class ShortHandOp {
    public static void main(String[] args) {
        //================================
        //(+) ADDITION ASSIGMENT
        int x = 20;
        x += 10;                        //==>20+10=30
        System.out.println(x);           //30
        x += 60;                        //x=x+60=90
        String schoolname = "Cybertek";
        schoolname += 12345;       //shoolname=Cybertek12345
        //It  will give  me concatination string.
        System.out.println(schoolname); //Cybertek12345

        //if I give a+b
        char c1 = 'a';                    //97
        c1 += 'b';                        //98
        System.out.println(c1);          //this give me a output 195, this give me a char.

        int num = '2';                   //num=122
        num += 'x';                      //num=num+120=242
        System.out.println(num);
       //===============================
        //(-)SUBTRACTION ASSIGMENT
        int A = 100;
        A -= 90;
        System.out.println(A);

        int B = 200;
        B -= A;                            //B=B-A;  190
        System.out.println(B);
        //================================
        //(*) MULTIPICATION ASSIGMENTS
        int a = 2;
        a *= 3;
        System.out.println(a);
        int b = a *= 10;                   //befora it takes other value (6) //b=a=a*10=60
        System.out.println(b);             //60
        System.out.println(a);             //60

        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;         //if b1= (a1*=2) not group this give as different number.
        System.out.println(b1);            //   b1=200+201=401

        int x1=10;
        int y=x1+=10*2;                    //x1=x1+20 //this is same think x1+=20;==>30
        System.out.println(y);

        int q=20;
        int p=q*=20*3;                     //q*=60;   // q=q*60; same think
        System.out.println(q);
       //================================
        //(/)DIVISION ASSIGMENT:
        int num1=300;
            num1/=2;                       //num1=num1/2;
        System.out.println(num1);          //final value is 150
        int num2=400;
            num2/=20+10;                   //RUULS: first right side after left side//
        System.out.println(num2);           //num2=400/30=13.1


    }
}


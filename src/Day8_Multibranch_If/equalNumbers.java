package Day8_Multibranch_If;

public class equalNumbers {
    public static void main(String[] args) {
        /*write a program that can check the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if n1 and n2 are equal  => n1&n2 are equal
        if n2 and n3 are equal ==> n2&n3 are equal
        if n3 and n1 are qual ==>n3&n1 are equal
        if all equal ==> all equal
        if none of them are euqal ==> none of them are equal*/
        double n1=100.5;
        double n2=200.5;
        double n3=300.5;
        boolean n1Equaln2=n1==n2 && n1 !=n3;//if n1 equal to n2 and does equal  n3, that makes n1
        boolean n1Equaln3=n1==n3 && n1 !=n2;//only n1 and n3 are equal
        boolean n2Equaln3=n2==n3 && n2 !=n1;
        boolean allEqual=n1==n2 && n1 ==n3; //all of them are equal
        boolean noneOfThemEqual=n1 !=n2 && n1!=n3 && n2!=n3;

        //KULLANILABILIR__boolean noneEqual=n1Equaln2==false&&n1Equaln3==false&&n2Equaln3;
        //KULLANILABILIR__boolean noneEqual2=!n1Equaln2&& !n1Equaln3&& !n2Equaln3;
        if(n1Equaln2){ System.out.println(n1+"is equal to "+n2);}
        //DAHA KOLAY__if(n1Equaln2){ System.out.println("n1 is equal to n2");}
        if(n1Equaln3){System.out.println(n1+"is equal to "+n3);}
        if(n2Equaln3){System.out.println(n2+"is equal to "+n3);}
        if(allEqual) {System.out.println(n1+"is equal to "+n2+"and"+n3);}
        if(noneOfThemEqual){System.out.println(n2+"is equal to "+n3);}




    }
}

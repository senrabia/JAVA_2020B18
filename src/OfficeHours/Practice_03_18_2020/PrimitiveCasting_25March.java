package OfficeHours.Practice_03_18_2020;

public class PrimitiveCasting_25March {
    /*primitive casting:implicit& explicid casting
    implicit: done otomaticly smaller primitive types ALWAYS be assigment
    to larger
    explicit:Must be done manually casting larger bprinmitive types
    to smaller one

     */
    public static void main(String[] args) {
        byte bnum=100;
        short snum=bnum;                //implicit casting

        int iNum=200;
        short sNum=(short)iNum;         //I can casted to short this is==> EXPLICIT

        float fNum=(float)0.5;          //I can casting to the float==>0.5
        System.out.println(fNum);       //0.5
        float fNum2=(long)0.5;          //RUULS=>only except whole number
                                        //fNum2=0;
                                        //fNum2=0.0;
        System.out.println(fNum2);
//RUULS==>long,int,short,byte==>only except whole number
        long lNum1=(long)4.5;
        System.out.println(lNum1);       //4.5 just whole num==>4
        System.out.println(9/2);
        System.out.println(9/(float)2); //4.5
        System.out.println(10.0/3);

    }
}
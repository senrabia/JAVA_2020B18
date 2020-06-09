package OfficeHours.Practice_05_13_2020;
//--5
public class staticBlock {
   static String str;
   int a;
  // static Excel excelsheet;
 /*  static String str="Cybertek";
   str=str.toUppercase();// EROR // WE can used inside the static block
    */
 //==========================================
    static{ str="Cybertek";
           str="Harward";
            str="MIT"; //it give me just MIT
            // a=500;  // EROR if we write static int it is WORK

    }  //Always CALL CLASS =if we dont have class is that not working

    public static void main(String[] args) {
        str="Cybertek";
        System.out.println(str);
    }
}

class staticBlockTest{
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }
}
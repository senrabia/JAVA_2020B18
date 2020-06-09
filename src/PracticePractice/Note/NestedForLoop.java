package PracticePractice.Note;

public class NestedForLoop {
    public static void main(String[] args) {
   //INW=============  NESTED LOOP   ====================

        String str="AABCCFFGEEFBGDFGBBVFGHJNBVF";
        String result="";  //A2B1C2
        String nonDup=""; //ABC

    //INW=======  Harf Sayisi Kadar Harf Output =========

      for(int i=0; i<=str.length()-1; i++){
          if(! nonDup.contains(""+str.charAt(i))){
            nonDup+=str.charAt(i);
        }}//System.out.println(nonDup);//Harf syisi kadat output.

   //INW========  A2B5  ====DUPLICATE CHAR AND STRING====

      /*=> ch yerine sadece 'A' veya any chat if used it give me this
      result */
        for(int j=0; j<= nonDup.length()-1; j++) {
            char ch = nonDup.charAt(j);

            int count = 0;//count the total num
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result += " " + ch + count;//Concat count and string.
        }//=> Bu parantes Sout altinda ise farkli sonuc alinir..
                System.out.println(result);

       //============  INDEX ARRAY  ==============
      //=============  arrays intro  =============

        int [] scores={70,75,85,90,95,100};
       //index num      0  1  2  3  4  5
        int num1=scores[2];      //index num//[]
        System.out.println(num1);//85
        int num2=scores[5];
        System.out.println(num2); //100

        //============   friends  ==================

        String[]friends={"Kuzzat","Asya","Akbar","Marufjan"};
        //System.out.println((friends[2])); //[]
          String s1=friends[2];              //[]
          System.out.println(s1);//Just one

         for(int i=0; i<=3; i++){
             String name=friends[i];
             System.out.println(name);}//All

        //================   gmail   =================

        String[] emails={"cybertek@yahoo.com","cybertek@gmail.com",
                "cybertek@hotmail.com","cybertek@outlook.com"};

         for(int i=0; i<=3; i++) {
            String email = emails[i];        //users gmail account.
            if(email.endsWith("gmail.com")){ //
            System.out.println(email);}

       // ===============   size of array ==============

             int[]arr1={10,20,30};
             System.out.println(arr1.length);  //3
             int[]arr2=new int[5];
             System.out.println(arr2[0]);
             System.out.println(arr2[1]);
        // ==============   string array =================

            String [] testers=new String[2]; //if you want more
            //               {"Reem", "Madina"};
            testers[0]="Reem";
            testers[1]="Madina";
            System.out.println(testers[0]);
            System.out.println(testers[1]);
            System.out.println("");}}}







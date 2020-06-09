package KizlarCaySaati;

public class PracticeArray {
    public static void main(String[] args) {
        //arr -each- minimum
        /*-fazla bilgi almasi
          -index uzerine kurulmus bir yapi
          ARRAYLAR METOD ile nasil kullanilir
          */
       // int[] a={235,555,5555,7854,554,3,1};
       // String[] x={"rabia","fatma","leyla"};

        int[]arr={5,4,6,2,8,9};
        int  max=arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);//2
        System.out.println("===========");
    }

}


package Day15_ForLoop;

public class ContiniuPractice {
    public static void main(String[] args) {
        //skip print Y, H, J, D,

        for(char ch='z'; ch>='A'; ch--){
            if(ch=='Y'|| ch=='H' || ch=='J'||ch=='D'){
                continue;
            }
            System.out.println(ch+" "); //Skip commend you can use OR LOJIK

        }
        System.out.println();
        for (int i=1; i<=50; i++){
         if(i%3==0 ||i%5==0) {
             continue;
         }
            System.out.println(i+" ");
    }

}
}

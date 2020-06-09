package Day26_MethodOverloading.MethodOverLoading;

public class Frequancy {
    /*	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
    */
    public static void main(String[] args) {
        String str="ABBAAA"; //if that contain A B B A A
        char ch='A';
        str.toCharArray();

       char[]arr=str.toCharArray(); //[A,A,A]
        int count=0;  //1+1+1

        for(char each :arr){  //char each char veriable*
              if(each==ch){
                  count++; }
    }
        System.out.println(count);
        String str2="ABCDEFGABABABAB";
        char ch2='D';
        int num2=frequency(str2,ch2);
        System.out.println(num2);
    }

    public static int frequency(String str,char ch){  //counts the ch' frequency
        char[]arr=str.toCharArray(); //[A,B,B]
        int count=0;  //1
        for(char each :arr){  //3 each: A,B,Bchar each char veriable*
            if(each==ch){
                count++; }

    }
return count;

}}

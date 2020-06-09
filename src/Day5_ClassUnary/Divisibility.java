package Day5_ClassUnary;

public class Divisibility {
    public static void main(String[] args) {
        //Data Type VariableName=Data
        int number=65;
        boolean divisibleBy2=number%2==0;
        //If the number can be  divided by 2 without any remainder,
        boolean divisibleBy3=number%3==0;
        //If the number can be  divided by 3without any remainder,
        boolean divisibleBy5=number%5==0;
        //If the number can be  divided by 5 without any remainder,
        String result1=number+" is divisible by 2:"+divisibleBy2;
        String result2=number+" is divisible by 3:"+divisibleBy3;
        String result3=number+" is divisible by 5:"+divisibleBy5;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        //*ORERATORS PREDECENCE(ONCELIKLI); highest=*, /, %, __________lowest=+, -,

}


    }


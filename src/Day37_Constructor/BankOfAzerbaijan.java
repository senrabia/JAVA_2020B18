package Day37_Constructor;

import java.util.ArrayList;

public class BankOfAzerbaijan {
    /*create class called BankOfAzerbaijan
		in the main method:
				constructor calls:
            1. only constructor can call other constructor
            2. constructor cannot be called by its name,  this() is used for calling
            3. constructor call needs to be at the first step
            4. One constructor can only call one constructor
            5. Contructor cannot call itself or conatin itself   */

    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(HumanResources.employee3);//0
        list.add(HumanResources.employee5);//1  Whatb is the index number

        System.out.println(list.get(0));//What is the method ==> get method
       //Why give me a NUll==> BECAUSE DECLARED STATIC BLOCK (Human Resouces Page)

    }
}

package Day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        /* 3 data structures:
          1.Array (Siralamak)
          2.Collection
          3.Maps
                variables: DataType veriableName=Data;
                   Arrays: a variable that can have multiple data
  FORMULA==>  declaration:
                DataType[]variableName={data1,data2,data3};
                            //    index: 0     1      2
                          the data storing MUST match with DataType
                          the []can be placed either after DataType or after variable name
               each data in the arrays has its own index number.
 retrive data from the arrays:
            variableName[index]
 initializing the size of the array:
              1.giving the values:
                            int[]arr={10,20,30};
 length:returns the values:size will be initilazion automaticaly
             int[]arr={10,20,30};


     */
        //int scores= 90,10,20; reguler variables can only have one data


        int[] scores={70,75,85,90,95,100};
               //     0   1  2  3  4   5
               //retrive:variableName[index]
                 int num1= scores[2]; //85,int
        System.out.println(num1);
                  int num2=scores[5]; //100,int
        System.out.println(num2);

    }
}

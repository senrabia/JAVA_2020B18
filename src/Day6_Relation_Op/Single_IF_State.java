package Day6_Relation_Op;

public class Single_IF_State{
    public static void main(String[] args) {
      /*__IF STATEMENT_ KIND OF BlOCK
          ????is it cold outside==>yes(true) Wear hat __Wear Coat
          if(boolean expression){
          codes; execution or not }
          The codes only get execution if the condition true */

        boolean coldWeather = true;
        if (coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear Your Coat");

            boolean coronaDetected = false;  // ==>true
            if (coronaDetected) {
                System.out.println("Buy more papers");
                System.out.println("Stay at home");
                System.out.println("Do more coding");
            }
            System.out.println("---------------");

        }

    }
}



package Day21_MultiDeminasionalArray;

public class Zoo {
    public static void main(String[] args) {
        String[] wieldAnimals={"Tiger","Lion","Monkey","Turtle","Corcodile"};
        String[] birds={"Eagle","Ducks","Peacock","chicken"};

        String[][] zoo={wieldAnimals,birds};
        //                  0         1
        String kfc =zoo[1][3];   //chicken
        System.out.println(kfc);
        System.out.println("==========================");

        for(String eachBirds:zoo[1]){// 4 times
            if(eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);}
        System.out.println("=============================");

        for(String each:zoo[0]){
            if(each.equals("Turtle")){
                continue;
            }
            System.out.println(each);

        }
    }

}

package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
       // carpets[3].customOrder(20,18,25,false);

        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
      //  System.out.println(carpets[3]);
//==================  EACH LOOP  ====================
        ArrayList<Carpet> parsianCarpets=new ArrayList<>();
        for(Carpet eachCarpet: carpets){
            if(eachCarpet.isPersian){
                parsianCarpets.add(eachCarpet);
            }
        }
        System.out.println("there are "+parsianCarpets.size()+"persian carpets");

        System.out.println(parsianCarpets.get(0).calcCost());
        System.out.println(parsianCarpets.get(1).calcCost());
        System.out.println(parsianCarpets.get(2).calcCost());
        System.out.println(parsianCarpets.get(3).calcCost());
 //====================  REMOVE ========================
   ArrayList<Carpet>regularCarpets=new ArrayList<>(Arrays.asList(carpets));
  // regularCarpets.removeAll(parsianCarpets); //same V
     regularCarpets.removeIf(p->p.isPersian);
        System.out.println("There are "+regularCarpets.size()+"regular carpets");

        for(int i=0; i<regularCarpets.size(); i++) {
            System.out.println(regularCarpets.get(0).calcCost());
        }

}}

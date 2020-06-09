package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    /*  Create a class called Offer that has:
      instance fields :
              location, company, salary , isFullTime
      instance methods :
          setOfferInfo: can set the location, company, salary , isFullTime of the offer
          toString -- return all info about offers
  create a class called MyOffers
      Create 5 offer objects, and add them into the list of offers, and then:
              1. use for loop to print out the info of each offer
              2. write a program that can only retain the offers if:
                      1. the offer is for fulltime position
                      2. offer is from your local area
                      3. salary is greater than 100K
=======================================================================

 */




    public static void main(String[] args) {
        Offer offer1= new Offer();
          offer1.setInfo ("VA","BOA",100000,true);
       // System.out.println(offer1);

        Offer offer2= new Offer();
        offer2.setInfo("KY","CapitalOne",120000,false);
       // System.out.println(offer2);

        Offer offer3= new Offer();
        offer3.setInfo("MD","Chase",95000,true);

        Offer offer4= new Offer();
        offer4.setInfo("BayArea","Google",115_000,false);

    //=======================   ARRAY LIST && ARRAY  ======================
        Offer[] offer={offer1,offer2,offer3,offer4};
        String myLocation="VA";  //my current state

        ArrayList<Offer> Accept= new ArrayList<>(Arrays.asList(offer));
       // Accept.removeIf(each->each.salary<100000 || each.isFullTime==false|| !each.location.equals(offer)); //we remoe the offer if it's less than 100K//if I want to REMOVE
       Accept.removeIf(each->each.salary<10000);
       Accept.removeIf(each->each.isFullTime==false);
       Accept.removeIf(each->!each.location.equals(myLocation));

        System.out.println(Accept.size());

        for(Offer eachOffer:Accept){
            System.out.println(eachOffer);
        }

    }
}

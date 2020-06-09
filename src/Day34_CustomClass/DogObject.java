package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setDogInfo("Husky","Small",4,"White","Ghost");//Short hand
       //these are parameter

      /*  dog1.breed="Husky";
        dog1.size="Small";
        dog1.color="White";
        dog1.name="Ghost";
        dog1.age=4;       */

      /*  System.out.println(dog1.breed); // ayrinti yazmazisem hash code give me and size is null .
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age); */
  Dog dog2=new Dog();
  dog2.setDogInfo("Alabay","Extra big",5,"Brown","Ajdar");

  Dog dog3=new Dog();
  dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("==============================");
        Dog dog4=new Dog();
        dog4.setDogInfo("pomerian","small",3,"white","lil");
        Dog dog5=new Dog();
        dog5.setDogInfo("pomerian","small",4,"white","Ernie");


        //================ Array List FOR LOOP =============
        ArrayList<Dog> puppies= new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));

        for(int i=0; i<puppies.size(); i++){
          Dog eachdog= puppies.get(i);
            System.out.println(eachdog);
        }

        System.out.println("==================================");
  //============   ========REMOVE IF  ========================
        puppies.removeIf(p->p.age>2);
        for(int i=0; i<puppies.size(); i++){
            Dog eachdog=puppies.get(i);
            System.out.println(eachdog);
        }


    }

}

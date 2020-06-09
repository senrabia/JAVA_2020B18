package Day37_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
   /*1. create a custom class for pizza that should contain the following:
    instance variables:
    size (either small, medium, large)
    number of cheese topping
    number of pepperoni toppings
    Add a constructor that can allow user to set the size and toppisngs of the pizza
    instance method:
    calcCost(): returns the total cost as double
    toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
    Pizza cost is determined by:
    Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
    Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
    Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
    create a class called Order
            create five objects of the pizza
            create an arraylist of pizza and add those 5 objects into it
    calculate the total price of the order (use for each loop)    */

   String size;
   int numCheeseT;
   int numPeperoniT;

   public Pizza (String size, int numCheeseT,int numPeperoniT){
    this.size=size;
    this.numCheeseT=numCheeseT;
    this.numPeperoniT=numPeperoniT;
}
    public double calcCost() {
        double cost = 0;
        if (size.equals("small")) {
            cost += 10 + (1.5 * numPeperoniT + 1 * numCheeseT);
        } else if (size.equals("medium")) {
            cost += 12 + (1.5 * numPeperoniT + 1 * numCheeseT);
        } else if (size.equals("large")) {
            cost += 14 + (1.5 * numPeperoniT + 1 * numCheeseT);
        }
        return cost;
    }
    public String toString(){
        return "Size: "+size+", Quantity: "+numPeperoniT+
                ", Quantity: "+numCheeseT;
    }
}
class order{
    public static void main(String[] args) {

            Pizza pizza1 = new Pizza("small", 2, 3);
            Pizza pizza2 = new Pizza("medium", 3, 1);
            Pizza pizza3 = new Pizza("large", 2, 1);
            Pizza pizza4 = new Pizza("medium", 2, 3);
            Pizza pizza5 = new Pizza("small", 1, 2);

            ArrayList<Pizza> pizzalist= new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));
            double total= 0;
            for( Pizza each : pizzalist){
                total+=each.calcCost();
            }
            System.out.println("$"+ total);
        }
    }

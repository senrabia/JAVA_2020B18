package Day33_CustomMethod_Intro;

public class NightHW_CustomMethod {
    public static void main(String[] args) {
        /*1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice  */

    /*   String size;
       int numberOfCheese;
       int numberOfPeperoni;
       double cost;
       public void customizeOrder(String size, int cheese, int peperoni){
            size = sizing;
            numberOfCheese = cheese;
            numberOfPeperoni = peperoni;
        }
       public double calculateCost(){
           if(size.equals("small")){
               return cost=10+(numberOfPeperoni*1.50)+
                       (numberOfCheese*1);
               return cost=12+(numberOfPeperoni*1.50)+
                       (numberOfCheese*1);
               return cost=15+(numberOfPeperoni*1.50)+
                       (numberOfCheese*1);
           }else{return 0;}
        }
        public String toString(){
           String result="I want "+ size +"pizza "+"with "+numberOfCheese+"cheese toppings and"+
           numberOfPeperoni+"peperoni toppings " +" and price is $ " + calculateCost();
           return result;
        }
*/

    }
}

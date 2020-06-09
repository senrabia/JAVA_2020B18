package Day38_Constructor;
//--1
public class Item {
    /*	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
    /*
    this: refers to object
     */



    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public  double calcCost(){   //if public STATIC we uset it give me a EROR
        return quantity*unitPrice;
    }
    public String toString(){
        return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                "\nTotal Cost of Item: $"+calcCost();
    }

    }

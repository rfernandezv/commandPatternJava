package commandPattern4.receiver;

public class Order {
	
	private String foodItem;
	private Integer foodQuantity;
	
	public Order(String foodItem, Integer foodQuantity) {
		this.foodItem = foodItem;
		this.foodQuantity = foodQuantity;
	}

        public void orderPlaced(){
            System.out.println("Order placed:" );
            System.out.println("  =>" + foodItem + " x " +foodQuantity);
        }
        
        public void orderValidated(){
            System.out.println("\nOrder validated correctly by Manager" );
        }
        
        public void orderPrepared(){
            System.out.println("\nOrder prepared:" );
            System.out.println("  => "+ foodQuantity + " " + foodItem);
        }
        
        public void orderServed(){
            System.out.println("\nOrder served: "+ foodItem + " " + foodQuantity);
            System.out.println(" Bon appetit!");
        }

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public Integer getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(Integer foodQuantity) {
		this.foodQuantity = foodQuantity;
	}	
}

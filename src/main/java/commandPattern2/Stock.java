package commandPattern2;


public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public void buy(){
        System.out.println("You want to buy books of "+this.name);
    }

    public void sell(){
        System.out.println("You want to sell books of "+this.name);
   }
}

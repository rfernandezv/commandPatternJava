package commandPattern2;

public class OperationTest {


    public static void main(String[] args) {
        Stock stockActual = new Stock("Design Patterns", 150);

        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(stockActual));
        broker.takeOrder(new SellStock(stockActual));
        broker.placeOrders();        
        
        
        Stock stockActual2 = new Stock("The Clean Code", 120);
        broker.takeOrderAndExecute(new BuyStock(stockActual2));
        broker.takeOrderAndExecute(new SellStock(stockActual2));
    }
    
}

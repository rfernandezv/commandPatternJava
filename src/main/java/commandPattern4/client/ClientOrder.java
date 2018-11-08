package commandPattern4.client;

import commandPattern4.concreteCommand.CommandCookOrder;
import commandPattern4.concreteCommand.CommandPlaceOrder;
import commandPattern4.concreteCommand.CommandServeOrder;
import commandPattern4.concreteCommand.CommandValidateOrder;
import commandPattern4.invoker.Cook;
import commandPattern4.invoker.Manager;
import commandPattern4.invoker.Waiter;
import commandPattern4.receiver.Order;

public class ClientOrder {

    public static void main(String[] args) {
        Order myOrder = new Order("Meat Burger", 2);		
		
        CommandPlaceOrder cmdPlaceOrder = new CommandPlaceOrder(myOrder);

        Waiter waiter = new Waiter();
        waiter.takeOrder(cmdPlaceOrder);
        

        CommandValidateOrder cmdValidateOrder = new CommandValidateOrder(myOrder);

        Manager manager = new Manager();
        manager.validateOrder(cmdValidateOrder);

        
        CommandCookOrder cmdCookOrder = new CommandCookOrder(myOrder);

        Cook cook = new Cook();
        cook.prepareOrder(cmdCookOrder);
       

        CommandServeOrder cmdServeOrder = new CommandServeOrder(myOrder);

        waiter.serveOrder(cmdServeOrder);
    }
    
}

package commandPattern4.concreteCommand;

import commandPattern4.Command;
import commandPattern4.receiver.Order;

public class CommandPlaceOrder implements Command {

	private Order order;
	
	public CommandPlaceOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
            this.order.orderPlaced();
	}
	
}

package commandPattern4.concreteCommand;

import commandPattern4.Command;
import commandPattern4.receiver.Order;

public class CommandCookOrder implements Command {

	private Order order;
	
	public CommandCookOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
            this.order.orderPrepared();
	}

}

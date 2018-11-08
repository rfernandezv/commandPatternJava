package commandPattern4.concreteCommand;

import commandPattern4.Command;
import commandPattern4.receiver.Order;

public class CommandValidateOrder implements Command {

	private Order order;
	
	public CommandValidateOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
            this.order.orderValidated();
	}
	
}

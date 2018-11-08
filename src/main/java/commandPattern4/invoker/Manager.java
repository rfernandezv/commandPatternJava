package commandPattern4.invoker;

import commandPattern4.Command;

public class Manager extends Invoker {

	@Override
	public void invokeCommand(Command Command) {
            Command.execute();
	}
	
	public void validateOrder(Command Command) {
            invokeCommand(Command);
	}	
}

package commandPattern4.invoker;

import commandPattern4.Command;

public class Waiter extends Invoker  {
	
	@Override
	public void invokeCommand(Command Command) {
            Command.execute();
	}
	
	public void takeOrder(Command Command) {
            invokeCommand(Command);
	}
	
	public void serveOrder(Command Command) {
            invokeCommand(Command);
	}	
}

package commandPattern4.invoker;

import commandPattern4.Command;

public class Cook extends Invoker {

	@Override
	public void invokeCommand(Command Command) {
		Command.execute();
	}
	
	public void prepareOrder(Command Command) {
		invokeCommand(Command);
	}	
}

package commandPattern4.invoker;

import commandPattern4.Command;

public abstract class Invoker {
	private String name;
	
	public abstract void invokeCommand(Command command);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

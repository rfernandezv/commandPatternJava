package commandPatternStructural;

public class ConcreteCommand implements Command{
    private Receiver receiver;

   public ConcreteCommand(final Receiver receiver) {
      this.receiver = receiver;
   }

   @Override    // Command
   public void execute() {
      receiver.Action();
   }
}

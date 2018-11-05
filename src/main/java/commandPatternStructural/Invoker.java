package commandPatternStructural;


public class Invoker {
    
    public void executeCommand(final Command cmd) {
      cmd.execute();
    }
}

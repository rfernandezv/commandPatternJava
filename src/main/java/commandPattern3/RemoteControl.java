package commandPattern3;

public class RemoteControl {
    
     public void buttonPressed(final Command cmd) {
      cmd.execute();
    }
}

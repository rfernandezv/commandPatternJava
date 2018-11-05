package commandPattern1;

public class FlipUpCommand implements Command{
    private Light theLight;

   public FlipUpCommand(final Light light) {
      this.theLight = light;
   }

   @Override    // Command
   public void execute() {
      theLight.turnOn();
   }
}

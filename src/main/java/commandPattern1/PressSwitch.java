package commandPattern1;

public class PressSwitch {

    public static void main(String[] args) {
        Light lamp = new Light();                           // Receiver

        Command switchUp = new FlipUpCommand(lamp);         // Command - ConcreteCommand
        Command switchDown = new FlipDownCommand(lamp);     // Command - ConcreteCommand

        final Switch mySwitch = new Switch();               // Invoker
        mySwitch.storeAndExecute(switchUp);                 // Set and execute command
        mySwitch.storeAndExecute(switchDown);
        
        mySwitch.listarHistorial();
        System.err.println("");
    }
    
}

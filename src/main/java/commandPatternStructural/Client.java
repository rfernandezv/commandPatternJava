package commandPatternStructural;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        
        invoker.executeCommand(command);
    }
    
}

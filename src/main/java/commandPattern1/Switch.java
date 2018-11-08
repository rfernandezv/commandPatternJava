package commandPattern1;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Switch {
   private List<Command> history = new ArrayList<Command>();

    public void execute(final Command cmd) {
      cmd.execute();
    }
   
    public void storeAndExecute(final Command cmd) {
      this.history.add(cmd); // optional
      cmd.execute();
    }
   
    public void listarHistorial(){
        for (int i=0; i<history.size(); i++) {
            System.out.println(history.get(i)); //true
        }
    }  
   
}

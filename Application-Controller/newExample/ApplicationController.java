import java.util.HashMap;

public class ApplicationController {
    
    private static final HashMap<String, HandleMath> hashMapOfCommands = new HashMap<>();

    public ApplicationController() {
    }
    
    static {
        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("^", new PowerOf());
        hashMapOfCommands.put("-", new Subtract());
    }
    
    public void handleCommand(String command, Integer num1, Integer num2) {
        
        HandleMath handler = hashMapOfCommands.get(command);
        
        handler.execute(num1, num2);
        
    }
}
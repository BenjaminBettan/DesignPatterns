package behavioural.command;

public class TurnOnLightCommand implements ICommand {
    private ILight light;
    
    TurnOnLightCommand(final ILight light){
        this.light = light;
    }
    
    public void execute() {
        light.turnOn();

    }

    public void rollback() {
        light.turnOff();
    }

}

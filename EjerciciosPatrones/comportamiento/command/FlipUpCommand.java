package command;

public class FlipUpCommand implements Command {
	
	private Light theLight;
	
	public FlipUpCommand(Light theLight) {
		this.theLight = theLight;
	}

	@Override
	public void execute() {
		theLight.turnOn();
	}

}

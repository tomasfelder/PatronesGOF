package command;

public class FlipDownCommand implements Command {

	private Light theLight;
	
	public FlipDownCommand(Light theLight) {
		this.theLight = theLight;
	}

	@Override
	public void execute() {
		theLight.turnOff();
	}

}

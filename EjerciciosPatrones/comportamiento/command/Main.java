package command;

public class Main {
	public static void main(String[] args){
		Light lampara = new Light();
		Command switchUp = new FlipUpCommand(lampara);
		Command switchDown = new FlipDownCommand(lampara);
		Switch mySwitch = new Switch(switchUp,switchDown);
		mySwitch.flipUp();
		mySwitch.flipDown();
	}
}

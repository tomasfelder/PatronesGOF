package adapter;

public class Main {

	public static void main(String[] args) {
		Guitar eGuitar = new ElectricGuitar();
		eGuitar.onGuitar();
		eGuitar.offGuitar();
		Guitar eAGuitar = new ElectroAcousticGuitar();
		eAGuitar.onGuitar();
		eAGuitar.offGuitar();
	}

}

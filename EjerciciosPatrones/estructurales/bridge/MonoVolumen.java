package bridge;

public class MonoVolumen extends Vehiculo {

	private boolean puertaCorrediza;

	public MonoVolumen(Motor motor,boolean puertaCorrediza) {
		super(motor);
		this.puertaCorrediza=puertaCorrediza;
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("MonoVehiculo " + (puertaCorrediza ? "con" : "sin") + 
            " puerta corrediza.");
	}

}

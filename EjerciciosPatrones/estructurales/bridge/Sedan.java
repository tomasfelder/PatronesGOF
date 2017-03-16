package bridge;

public class Sedan extends Vehiculo {

	private int capacidadMaletero;
	
	public Sedan(Motor motor,int cap) {
		super(motor);
		this.capacidadMaletero=cap;
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Vehiculo sedan con un maletero para "
					+capacidadMaletero+" litros.");
	}

}

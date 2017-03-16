package bridge;

public abstract class Vehiculo {
	
	private Motor motor;
	
	public Vehiculo(Motor motor){
		this.motor = motor;
	}
	
	public void acelerar(double d){
		motor.inyectarCombustible(d);
		motor.consumirCombustible();
	}
	
	public void frenar(){
		System.out.println("El vehiculo esta frenando.");
	}
	
	public abstract void mostrarCaracteristicas();
	
}

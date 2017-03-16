package bridge;

public class Main {

	public static void main(String[] args) {
		Vehiculo mono = new MonoVolumen(new Diesel(),false);
		mono.acelerar(1.4);
		mono.mostrarCaracteristicas();
		mono = new Sedan(new Gasolina(), 45);
		mono.acelerar(1.7);
		mono.mostrarCaracteristicas();
	}

}

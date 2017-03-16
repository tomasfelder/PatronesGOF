package bridge;

public class Gasolina implements Motor {

	@Override
	public void inyectarCombustible(double cantidad) {
		System.out.println("Inyectando "+cantidad+" litros de gasolina.");
	}

	@Override
	public void consumirCombustible() {
		realizarCombustion();
	}

	private void realizarCombustion() {
		System.out.println("Realiada la combustion de la gasolina.");
	}

}

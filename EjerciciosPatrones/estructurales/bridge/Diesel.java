package bridge;

public class Diesel implements Motor {

	@Override
	public void inyectarCombustible(double cantidad) {
		System.out.println("Inyectando "+cantidad+" litros de gasoil.");
	}

	@Override
	public void consumirCombustible() {
		realizarExplosion();
	}

	private void realizarExplosion() {
		System.out.println("Realiada la explosion del gasoil.");
	}

}

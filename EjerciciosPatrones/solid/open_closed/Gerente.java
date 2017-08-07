package open_closed;

public class Gerente extends Empleado {

	@Override
	public void calcularBono() {
		this.setBono(getSueldo()*10);
	}

}

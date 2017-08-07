package open_closed;

public class Programador extends Empleado {

	@Override
	public void calcularBono() {
		this.setBono(this.getSueldo()*2);
	}

}

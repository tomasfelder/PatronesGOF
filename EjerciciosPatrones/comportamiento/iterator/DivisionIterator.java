package iterator;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Empleado> {

	private Empleado[] empleados;
	private int posicion;
	
	public DivisionIterator(Empleado[] empleados){
		this.empleados=empleados;
		posicion=0;
	}
	
	@Override
	public boolean hasNext() {
		if(posicion<empleados.length && empleados[posicion]!=null)
			return true;
		else
			return false;
	}

	@Override
	public Empleado next() {
		return empleados[posicion++];
	}

}

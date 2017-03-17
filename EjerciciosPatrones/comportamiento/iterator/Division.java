package iterator;

import java.util.Iterator;

public class Division implements Iterable<Empleado> {
	
	private Empleado[] empleados;
	private int numero;
	private String nombreDivision;
	
	public Division(String nombreDivision) {
		this.nombreDivision = nombreDivision;
		empleados= new Empleado[100];
		numero=0;
	}
	
	public String getNombre(){
		return nombreDivision;
	}
	
	public void add(String nombre){
		Empleado e = new Empleado(nombre,nombreDivision);
		empleados[numero++]=e;
	}

	@Override
	public Iterator<Empleado> iterator() {
		// TODO Auto-generated method stub
		return new DivisionIterator(empleados);
	}
	
}
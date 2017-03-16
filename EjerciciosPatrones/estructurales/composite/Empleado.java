package composite;

public class Empleado implements Sueldo {

	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre,double sueldo){
		setNombre(nombre);
		setSueldo(sueldo);
	}
	
	@Override
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}

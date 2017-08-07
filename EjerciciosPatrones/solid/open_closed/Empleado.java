package open_closed;

public abstract class Empleado {
	private String nombre;
	private double sueldo;
	private double bono;
	
	public abstract void calcularBono();

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return the bono
	 */
	public double getBono() {
		return bono;
	}

	/**
	 * @param bono the bono to set
	 */
	public void setBono(double bono) {
		this.bono = bono;
	}
}

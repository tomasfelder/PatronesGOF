package open_closed;

public class Empleado_No_OCP {
	private String nombre;
	private double sueldo;
	private double bono;
	private TipoEmpleado tipo;
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
	/**
	 * @return the tipo
	 */
	public TipoEmpleado getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}
}

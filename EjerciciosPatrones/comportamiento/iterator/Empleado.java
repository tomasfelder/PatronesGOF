package iterator;

public class Empleado {

	private String nombre;
	private String division;
	
	public Empleado(String nombre, String division) {
		this.nombre = nombre;
		this.division = division;
	}
	
	public String getNombre(){
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", division=" + division + "]";
	}
	
}

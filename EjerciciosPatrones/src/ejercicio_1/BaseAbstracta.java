package ejercicio_1;

public abstract class BaseAbstracta {
	
	private String nombre;
	
	public BaseAbstracta(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public abstract int numeroDeAmbulancias();
	public abstract float tiempoMedioDeAsistencia();
}

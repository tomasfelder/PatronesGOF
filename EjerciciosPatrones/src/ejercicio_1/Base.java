package ejercicio_1;

public class Base extends BaseAbstracta {
	
	private int nroAmbulancias;
	private float tiempoMedioAsistencia;
	
	public Base(String nombre,int nro,float tiempoMedio){
		super(nombre);
		nroAmbulancias=nro;
		tiempoMedioAsistencia=tiempoMedio;
	}
	
	@Override
	public int numeroDeAmbulancias() {
		// TODO Auto-generated method stub
		return nroAmbulancias;
	}

	@Override
	public float tiempoMedioDeAsistencia() {
		// TODO Auto-generated method stub
		return tiempoMedioAsistencia;
	}

}

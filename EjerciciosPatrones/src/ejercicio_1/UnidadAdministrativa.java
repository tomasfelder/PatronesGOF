package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class UnidadAdministrativa extends BaseAbstracta {
	
	private List<BaseAbstracta> bases;
	
	public UnidadAdministrativa(String nombre) {
		super(nombre);
		bases=new ArrayList<BaseAbstracta>();
	}
	
	public void agregarBase(BaseAbstracta base){
		bases.add(base);
	}
	
	@Override
	public int numeroDeAmbulancias() {
		int cant=0;
		for(BaseAbstracta b:bases)
			cant+=b.numeroDeAmbulancias();
		return cant;
	}

	@Override
	public float tiempoMedioDeAsistencia() {
		float cant=0;
		for(BaseAbstracta b:bases)
			cant+=b.tiempoMedioDeAsistencia();
		return cant/bases.size();
	}

}

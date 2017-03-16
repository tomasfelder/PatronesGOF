package composite;

import java.util.ArrayList;
import java.util.List;

public class SectorBanco implements Sueldo {

	private List<Sueldo> empleados = new ArrayList<Sueldo>();
	
	@Override
	public double getSueldo() {
		double sumador=0;
		for(Sueldo s:empleados)
			sumador+=s.getSueldo();
		return sumador;
	}
	
	public void agrega(Sueldo s){
		empleados.add(s);
	}

}

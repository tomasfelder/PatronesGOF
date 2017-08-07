package open_closed;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosServicio {
	
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public void calcularBonos(){
		for(Empleado e:empleados)
			e.calcularBono();
	}
	
}

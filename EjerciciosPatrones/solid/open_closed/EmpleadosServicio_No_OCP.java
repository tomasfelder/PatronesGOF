package open_closed;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosServicio_No_OCP {
	
	private List<Empleado_No_OCP> empleados = new ArrayList<Empleado_No_OCP>();
	
	public void calcularBonos(){
		for(Empleado_No_OCP e:empleados){
			double bono=0;
			switch(e.getTipo()){
			case PROGRAMADOR:
				bono = e.getSueldo()*2;
				break;
			case GERENTE:
				bono = e.getSueldo()*10;
				break;
			}
			e.setBono(bono);
		}
	}
	
}

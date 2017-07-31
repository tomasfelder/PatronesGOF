package detectores_de_humo;

import java.util.ArrayList;
import java.util.List;

public class Sala_Grande implements IDetector{

	private List<Detector> detectores;
	
	public Sala_Grande() {
		detectores=new ArrayList<Detector>();
	}
	
	public void agregar(Detector d) {
		detectores.add(d);
	}
	
	public void quitar(Detector d) {
		detectores.remove(d);
	}
	
	public void encender() {
		for(IDetector d : detectores) {
			d.encender();
		}
	}
	
	public void apagar() {
		for(IDetector d : detectores) {
			d.apagar();
		}
	}

	@Override
	public void accept(Visitor v) {
		for(Detector d : detectores) {
			d.accept(v);
		}
	}
	
}

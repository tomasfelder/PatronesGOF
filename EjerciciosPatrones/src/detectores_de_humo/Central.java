package detectores_de_humo;

import java.util.ArrayList;
import java.util.List;

public class Central {
	
	private static volatile Central central;
	private List<IDetector> detectores;
	
	private Central() {
		detectores=new ArrayList<IDetector>();
	}
	
	public static synchronized Central getInstance() {
		return (central==null) ? new Central() : central;
	}
	
	public void agregarDetector(IDetector d){
		detectores.add(d);
	}
	
	public void encenderDetector(int i){
		detectores.get(i).encender();
	}
	
	public double indiceSeguridad() {
		IndiceSeguridad v = new IndiceSeguridad();
		for(IDetector d: detectores)
			d.accept(v);
		
		return v.porcentaje();
	}
	
	public int cantDetectores(){
		return detectores.size();
	}
	
}

package detectores_de_humo;

import java.util.ArrayList;
import java.util.List;

public class Central implements Visitor {
	
	private static volatile Central central;
	private List<IDetector> detectores;
	
	private Central() {
		detectores=new ArrayList<IDetector>();
	}
	
	public static synchronized Central getInstance() {
		return (central==null) ? new Central() : central;
	}
	
	public int indiceSeguridad() {
		return 0;
	}
	
	@Override
	public void visitDetector(Detector d) {
		
	}

	@Override
	public void visitSalaGrande(Sala_Grande s) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

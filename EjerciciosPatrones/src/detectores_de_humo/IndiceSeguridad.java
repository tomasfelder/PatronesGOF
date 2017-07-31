package detectores_de_humo;

public class IndiceSeguridad implements Visitor {
	
	private int cantPrendidos;
	private int cantDetectores;
	
	public IndiceSeguridad(){
		cantPrendidos=0;
		cantDetectores=0;
	}
	
	@Override
	public void visitDetector(Detector d) {
		if(d.estaEncendido()){
			cantPrendidos++;
		}
		cantDetectores++;
	}

	@Override
	public void visitSalaGrande(Sala_Grande s) {
		
	}
	
	
	public double porcentaje(){
		return (double) cantPrendidos/cantDetectores;
	}
	
}

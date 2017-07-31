package detectores_de_humo;

public class RevisionTecnica implements Visitor {

	private int requierenRevision;
	private int parametro;
	
	public RevisionTecnica(int p){
		parametro=p;
	}
	
	@Override
	public void visitDetector(Detector d) {
		if(d.cantApagados()>=parametro)
			requierenRevision++;
	}

	@Override
	public void visitSalaGrande(Sala_Grande s) {
		// TODO Auto-generated method stub

	}
	
	public int cantRevision(){
		return requierenRevision;
	}
	
}

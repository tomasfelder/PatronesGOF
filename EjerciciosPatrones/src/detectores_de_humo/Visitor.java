package detectores_de_humo;

public interface Visitor {
	public void visitDetector(Detector d);
	public void visitSalaGrande(Sala_Grande s);
}

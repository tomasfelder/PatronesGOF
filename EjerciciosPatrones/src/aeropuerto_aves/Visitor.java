package aeropuerto_aves;

public interface Visitor {
	public void visit(Dispositivo d);
	public void visit(Sector s);
}

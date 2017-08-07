package aeropuerto_aves;

public class VisitorContador implements Visitor {

	private int cantidad;
	
	public VisitorContador() {
		cantidad=0;
	}
	
	@Override
	public void visit(Dispositivo d) {
		cantidad+=d.getCantEstruendos();
	}

	@Override
	public void visit(Sector s) {
		// TODO Auto-generated method stub
	}

	public int getCantidad(){
		return cantidad;
	}
	
}

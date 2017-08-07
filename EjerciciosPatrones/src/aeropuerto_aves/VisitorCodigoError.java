package aeropuerto_aves;

public class VisitorCodigoError implements Visitor {

	private String etiquetas;
	private int codigoVerificar;
	
	public VisitorCodigoError(int cod) {
		etiquetas="";
		codigoVerificar=cod;
	}
	
	@Override
	public void visit(Dispositivo d) {
		// TODO Auto-generated method stub
		if(d.getUltimoCodigoDetonacion()==codigoVerificar)
			etiquetas+="Dispositivo: "+d.getCodigo()+"\n";
		
	}

	@Override
	public void visit(Sector s) {
		// TODO Auto-generated method stub

	}

	public String etiquetas(){
		return etiquetas;
	}
	
}

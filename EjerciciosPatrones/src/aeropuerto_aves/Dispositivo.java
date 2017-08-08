package aeropuerto_aves;

public class Dispositivo implements IDispositivo {

	private String codigo;
	private boolean prendido;
	private int cantEstruendos;
	private int ultimoCodigoDetonacion;
	
	public Dispositivo(String cod) {
		codigo=cod;
		prendido=false;
		cantEstruendos=0;
	}
	
	@Override
	public void agregar(IDispositivo d) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("No se puede agregar un hijo a una hoja");
	}

	@Override
	public void remover(IDispositivo d) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("No se puede agregar un hijo a una hoja");
	}

	@Override
	public void prender() {
		// TODO Auto-generated method stub
		prendido=true;
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		prendido=false;
	}

	@Override
	public boolean estaPrendido() {
		// TODO Auto-generated method stub
		return prendido;
	}

	@Override
	public void recargar() {
		// TODO Auto-generated method stub
		cantEstruendos=0;
	}

	@Override
	public String disparar() {
		// TODO Auto-generated method stub
		if(cantEstruendos<50)
			cantEstruendos++;
		ultimoCodigoDetonacion=BangController.checkDetonacion();
		return "Dispositivo: "+codigo+" - Codigo de error: "+ultimoCodigoDetonacion;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
	public int getCantEstruendos() {
		return cantEstruendos;
	}
	
	public int getUltimoCodigoDetonacion() {
		return ultimoCodigoDetonacion;
	}
	
	public String getCodigo(){
		return codigo;
	}
}

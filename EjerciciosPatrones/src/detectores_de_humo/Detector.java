package detectores_de_humo;

public class Detector implements IDetector {
	
	private boolean encendido;
	private int id;
	private int cantApagados;
	
	public Detector(int id) {
		this.id=id;
		cantApagados=0;
		encendido=false;
	}
	
	public void encender() {
		encendido=true;
	}
	
	public void apagar() {
		encendido=false;
		cantApagados++;
	}
	
	public boolean estaEncendido(){
		return encendido;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitDetector(this);
	}
	
	public int cantApagados(){
		return cantApagados;
	}
	
}

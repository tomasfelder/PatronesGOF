package aeropuerto_aves;

import java.util.ArrayList;
import java.util.List;

public class Sector implements IDispositivo {

	private List<IDispositivo> dispositivos;
	private String codigo;
	
	public Sector(String cod) {
		dispositivos = new ArrayList<IDispositivo>();
		codigo=cod;
	}
	
	@Override
	public void agregar(IDispositivo d) {
		// TODO Auto-generated method stub
		dispositivos.add(d);
	}

	@Override
	public void remover(IDispositivo d) {
		// TODO Auto-generated method stub
		dispositivos.remove(d);
	}

	@Override
	public void prender() {
		// TODO Auto-generated method stub
		for(IDispositivo d:dispositivos)
			d.prender();
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		for(IDispositivo d:dispositivos)
			d.apagar();
	}

	@Override
	public boolean estaPrendido() {
		// TODO Auto-generated method stub
		if(!dispositivos.isEmpty())
			return dispositivos.get(0).estaPrendido();
		return false;
	}

	@Override
	public void recargar() {
		// TODO Auto-generated method stub
		for(IDispositivo d:dispositivos)
			d.recargar();
	}

	@Override
	public String disparar() {
		// TODO Auto-generated method stub
		String reporte="Sector: "+codigo+"\n";
		for(IDispositivo d:dispositivos)
			reporte+=d.disparar()+"\n";
		return reporte;
	}

	public void accept(Visitor v){
		for(IDispositivo d : dispositivos)
			d.accept(v);
	}
	
}

package observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro implements Subject {

	private List<LibroMalEstado> observadores;
	
	public AlarmaLibro(){
		observadores=new ArrayList<LibroMalEstado>();
	}
	
	@Override
	public void attach(LibroMalEstado observador) {
		observadores.add(observador);
	}

	@Override
	public void dettach(LibroMalEstado observador) {
		observadores.remove(observador);
	}

	@Override
	public void notifyObservers() {
		for(LibroMalEstado o:observadores)
			o.update();
	}

}

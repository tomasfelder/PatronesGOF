package observer;

public class Biblioteca {
	
	public void devolverLibro(Libro libro,AlarmaLibro a){
		if(libro.getEstado().equals("MALO"))
			a.notifyObservers();	
	}
	
}

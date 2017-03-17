package observer;

public interface Subject {
	public void attach(LibroMalEstado observador);
	public void dettach(LibroMalEstado observador);
	public void notifyObservers();
}

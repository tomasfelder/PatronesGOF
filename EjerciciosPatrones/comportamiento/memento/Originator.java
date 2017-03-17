package memento;

public class Originator {
	
	private String state;
	
	public void set(String state){
		System.out.println("Originaador: Seteando estado a "+state);
		this.state=state;
	}
	
	public Memento saveToMemento(){
		System.out.println("Originador guardando en Memento");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento m){
		state = m.getSavedState();
		System.out.println("Originador recupera estado desde memento. Estado actual "+state);
	}
}

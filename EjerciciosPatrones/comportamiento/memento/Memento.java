package memento;

public class Memento {
	
	private String state;
	
	public Memento(String toSave){
		state=toSave;
	}
	
	public String getSavedState(){
		return state;
	}
	
}

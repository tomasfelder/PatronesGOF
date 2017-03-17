package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Memento> savedStates;
	
	public Caretaker(){
		savedStates=new ArrayList<Memento>();
	}
	
	public void addMemento(Memento m){
		savedStates.add(m);
	}
	
	public Memento getMemento(int index){
		return savedStates.get(index);
	}
}

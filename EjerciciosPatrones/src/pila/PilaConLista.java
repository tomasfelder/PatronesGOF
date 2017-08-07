package pila;

import java.util.List;

public class PilaConLista<T> implements Pila<T> {

	private List<T> secuencia;
	
	public PilaConLista(List<T> lista){
		secuencia=lista;
	}
	
	@Override
	public void push(T elemento) {
		secuencia.add(0, elemento);
	}

	@Override
	public T pop() {
		return secuencia.remove(0);
	}

	@Override
	public T top() {
		return secuencia.get(0);
	}

}

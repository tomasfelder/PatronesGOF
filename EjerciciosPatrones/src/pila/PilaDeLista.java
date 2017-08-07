package pila;

import java.util.ArrayList;

public class PilaDeLista<T> extends ArrayList<T> implements Pila<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void push(T elemento) {
		this.add(0, elemento);
	}

	@Override
	public T pop() {
		return this.remove(0);
	}

	@Override
	public T top() {
		return this.get(0);
	}

}

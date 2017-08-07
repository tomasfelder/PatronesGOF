package pila;

public interface Pila<T> {
	public void push(T elemento);
	public T pop();
	public T top();
}

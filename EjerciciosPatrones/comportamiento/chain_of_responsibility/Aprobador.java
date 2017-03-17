package chain_of_responsibility;

public interface Aprobador {
	public void setNext(Aprobador a);
	public Aprobador getNext();
	public void solicitudPrestamo(int monto);
}

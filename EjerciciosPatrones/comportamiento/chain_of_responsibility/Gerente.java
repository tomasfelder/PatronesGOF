package chain_of_responsibility;

public class Gerente implements Aprobador {

	private Aprobador next;
	
	@Override
	public void setNext(Aprobador a) {
		next=a;
	}

	@Override
	public Aprobador getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto>50000 && monto<=100000)
			System.out.println("Lo manejo yo, el gerente del banco.");
		else
			next.solicitudPrestamo(monto);
	}
	
}

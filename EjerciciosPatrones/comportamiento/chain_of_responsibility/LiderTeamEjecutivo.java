package chain_of_responsibility;

public class LiderTeamEjecutivo implements Aprobador {

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
		if(monto>10000 && monto<=50000)
			System.out.println("Lo manejo yo, el lider del team ejecutivo.");
		else
			next.solicitudPrestamo(monto);
	}
	
}

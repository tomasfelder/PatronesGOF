package chain_of_responsibility;

public class Banco {
	public static void main(String[] args){
		Aprobador ejecutivo = new EjecutivoDeCuenta();
		Aprobador lider = new LiderTeamEjecutivo();
		Aprobador gerente = new Gerente();
		Aprobador director = new Director();
		ejecutivo.setNext(lider);
		lider.setNext(gerente);
		gerente.setNext(director);
		ejecutivo.solicitudPrestamo(25000);
	}
}

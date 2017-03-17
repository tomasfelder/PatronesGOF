package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Administracion());
		a.attach(new Compras());
		a.attach(new Stock());
		Biblioteca b = new Biblioteca();
		Libro libro = new Libro("1984");
		libro.setEstado("MALO");
		b.devolverLibro(libro, a);
	}

}

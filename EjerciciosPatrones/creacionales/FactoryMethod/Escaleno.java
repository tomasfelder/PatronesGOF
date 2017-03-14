package FactoryMethod;

public class Escaleno extends Triangulo {

	public Escaleno(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		return "Triangulo escaleno";
	}

}

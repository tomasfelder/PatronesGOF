package FactoryMethod;

public class Isosceles extends Triangulo {

	public Isosceles(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		return "Triangulo isosceles";
	}

}

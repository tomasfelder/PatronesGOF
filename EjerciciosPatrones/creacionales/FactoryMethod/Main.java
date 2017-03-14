package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		TrianguloFactoryMethod f=new FactoriaTriangulo();
		Triangulo t=f.crearTriangulo(1, 3, 2);
		System.out.printf("%s",t.getDescripcion());
	}

}

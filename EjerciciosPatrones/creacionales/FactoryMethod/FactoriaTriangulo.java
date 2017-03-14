package FactoryMethod;

public class FactoriaTriangulo implements TrianguloFactoryMethod {

	@Override
	public Triangulo crearTriangulo(int a, int b, int c) {
		if(a==b && a==c)
			return new Equilatero(a,b,c);
		else
			if(a!=b && a!=c && b!=c)
				return new Escaleno(a,b,c);
			else
				return new Isosceles(a,b,c);
	}

}

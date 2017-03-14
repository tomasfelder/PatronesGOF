package FactoryMethod;

public class Equilatero extends Triangulo {

	public Equilatero(int a,int b,int c){
		super(a,b,c);
	}
	
	@Override
	public String getDescripcion() {
		return "Triangulo equilatero";
	}

}

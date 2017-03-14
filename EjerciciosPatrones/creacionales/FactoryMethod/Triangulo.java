package FactoryMethod;

public abstract class Triangulo {
	
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int a,int b,int c){
		ladoA=a;
		ladoB=b;
		ladoC=c;
	}
	
	public abstract String getDescripcion();
	
}

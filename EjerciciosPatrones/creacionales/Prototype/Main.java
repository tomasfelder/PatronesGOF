package Prototype;

public class Main {
	public static  void main(String[] args){
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		Producto producto = (Producto) factoria.create("producto 1");
		System.out.println("Este es el objeto creado: "+producto.toString());
	}
}

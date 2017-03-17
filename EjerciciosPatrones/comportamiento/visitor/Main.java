package visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoNormal normal = new ProductoNormal(100);
		ProductoDescuento reducido = new ProductoDescuento(100);
		
		IVA iva = new IVA();
		System.out.println(normal.aceptar(iva));
		System.out.println(reducido.aceptar(iva));
	}

}

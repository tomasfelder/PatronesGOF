package visitor;

public class IVA implements Visitor {
	
	private static final double IMPUESTO_NORMAL = 1.21;
	private static final double IMPUESTO_REDUCIDO = 1.105;
	
	@Override
	public double visitar(ProductoNormal normal) {
		// TODO Auto-generated method stub
		return normal.getPrecio()*IMPUESTO_NORMAL;
	}

	@Override
	public double visitar(ProductoDescuento reducido) {
		// TODO Auto-generated method stub
		return reducido.getPrecio()*IMPUESTO_REDUCIDO;
	}

}

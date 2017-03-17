package visitor;

public interface Visitor {
	public double visitar(ProductoNormal normal);
	public double visitar(ProductoDescuento reducido);
}

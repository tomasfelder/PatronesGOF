package visitor;

public class ProductoDescuento implements Visitable {

	private double precio;
	
	public ProductoDescuento(double precio){
		this.setPrecio(precio);
	}
	
	@Override
	public double aceptar(Visitor v) {
		// TODO Auto-generated method stub
		return v.visitar(this);
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

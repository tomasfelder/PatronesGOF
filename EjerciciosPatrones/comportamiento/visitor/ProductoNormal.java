package visitor;

public class ProductoNormal implements Visitable {

	private double precio;
	
	public ProductoNormal(double precio){
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

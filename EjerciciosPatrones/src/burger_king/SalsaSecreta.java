package burger_king;

public class SalsaSecreta extends Ingrediente {

	public SalsaSecreta(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return getProducto().getIngredientes()+"-Salsa Secreta";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getProducto().getPrecio()+15;
	}

}

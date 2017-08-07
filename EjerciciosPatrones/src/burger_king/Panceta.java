package burger_king;

public class Panceta extends Ingrediente {

	public Panceta(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return getProducto().getIngredientes()+"-Panceta";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getProducto().getPrecio()+10;
	}

}

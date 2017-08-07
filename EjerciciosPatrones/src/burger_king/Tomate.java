package burger_king;

public class Tomate extends Ingrediente {

	public Tomate(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return getProducto().getIngredientes()+"-Tomate";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getProducto().getPrecio()+5;
	}

}

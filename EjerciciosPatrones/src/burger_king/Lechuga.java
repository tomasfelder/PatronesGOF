package burger_king;

public class Lechuga extends Ingrediente {

	public Lechuga(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return getProducto().getIngredientes()+"-Lechuga";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getProducto().getPrecio()+3;
	}

}

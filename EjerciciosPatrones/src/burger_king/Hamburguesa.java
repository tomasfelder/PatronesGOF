package burger_king;

public class Hamburguesa implements Producto {

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return "Hamburguesa";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	public Producto clone(){
		try {
			return (Producto) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

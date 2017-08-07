package burger_king;

public abstract class Ingrediente implements Producto {

	private Producto pr;
	
	public Ingrediente(Producto p){
		pr=p;
	}
	
	public Producto getProducto(){
		return pr;
	}
	
	public Ingrediente clone(){
		try {
			return (Ingrediente) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

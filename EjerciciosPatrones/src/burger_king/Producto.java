package burger_king;

public interface Producto extends Cloneable {
	public String getIngredientes();
	public int getPrecio();
	public Producto clone();
}

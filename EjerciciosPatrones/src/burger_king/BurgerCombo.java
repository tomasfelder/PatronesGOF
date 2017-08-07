package burger_king;

public class BurgerCombo {
	
	private Producto sandwich;
	
	public BurgerCombo(){
		sandwich = new Tomate(new Lechuga(new Hamburguesa()));
	}
	
	public Producto getPrototipo(){
		return sandwich.clone();
	}
	
}

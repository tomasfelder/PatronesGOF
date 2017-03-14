package Builder;

public abstract class PizzaBuilder {
	
	private Pizza pizza;
	
	public Pizza getPizza(){
		return pizza;
	}
	public void crearNuevaPizza(){
		pizza=new Pizza();
	}
	
	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();
	
}

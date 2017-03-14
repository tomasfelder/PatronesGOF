package Builder;

public class Cocina {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pz){
		pizzaBuilder=pz;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void construirPizza(){
		pizzaBuilder.crearNuevaPizza();
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildRelleno();
	}
}

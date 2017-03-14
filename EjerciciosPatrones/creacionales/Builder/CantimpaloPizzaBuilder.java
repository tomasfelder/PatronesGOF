package Builder;

public class CantimpaloPizzaBuilder extends PizzaBuilder {

	public void buildMasa() {
		getPizza().setMasa("crocante");
	}

	@Override
	public void buildSalsa() {
		getPizza().setSalsa("Tomate con ajo");
	}

	@Override
	public void buildRelleno() {
		getPizza().setRelleno("Queso y cantimpalo");
	}
	
}

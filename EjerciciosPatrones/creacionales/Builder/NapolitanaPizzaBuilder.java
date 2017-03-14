package Builder;

public class NapolitanaPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		getPizza().setMasa("suave");
	}

	@Override
	public void buildSalsa() {
		getPizza().setSalsa("Tomate con ajo");
	}

	@Override
	public void buildRelleno() {
		getPizza().setRelleno("Queso,jamon y tomate");
	}

}

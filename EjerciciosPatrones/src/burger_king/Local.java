package burger_king;

import java.util.Iterator;

public class Local {

	public static void main(String[] args) {
		Producto p = new SalsaSecreta(new Tomate(new Hamburguesa()));
		Producto p2 = new Tomate(new Hamburguesa());
		Producto p3 = new Lechuga(new Panceta(new Hamburguesa()));
		Producto p4 = new SalsaSecreta(new Hamburguesa());
		Bandeja b = Bandeja.getInstance();
		b.agregarSandwich(p);
		b.agregarSandwich(p2);
		b.agregarSandwich(p3);
		b.agregarSandwich(p4);
		Iterator<Producto> it = b.iterator(1);
		while(it.hasNext())
			System.out.println(it.next().getPrecio());
	}

}

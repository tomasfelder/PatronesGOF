package burger_king;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return new Integer(o1.getPrecio()).compareTo(new Integer(o2.getPrecio()));
	}

}

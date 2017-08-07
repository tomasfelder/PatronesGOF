package burger_king;

import java.util.Comparator;

public class ComparadorSalsa implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		if(o1.getIngredientes().contains("Salsa Secreta")&&
				!o2.getIngredientes().contains("Salsa Secreta"))
			return -1;
		else{
			if(!o1.getIngredientes().contains("Salsa Secreta")&&
					o2.getIngredientes().contains("Salsa Secreta"))
				return 1;
			else
				return 0;
		}
	}

}

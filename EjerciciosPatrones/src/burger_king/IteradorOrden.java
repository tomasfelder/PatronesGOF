package burger_king;

import java.util.Iterator;
import java.util.List;

public class IteradorOrden implements Iterator<Producto> {

	private List<Producto> cola;
	private int puntero;
	
	public IteradorOrden(List<Producto> hamburguesas) {
		// TODO Auto-generated constructor stub
		cola=hamburguesas;
		puntero=0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return puntero<cola.size() && cola.get(puntero)!=null;
	}

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return cola.get(puntero++);
	}

}

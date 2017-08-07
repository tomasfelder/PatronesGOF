package burger_king;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteradorSalsa implements Iterator<Producto> {

	private Queue<Producto> cola;

	public IteradorSalsa(List<Producto> hamburguesas,Comparator<Producto> comp) {
		// TODO Auto-generated constructor stub
		cola = new PriorityQueue<Producto>(100,comp);
		for(Producto p:hamburguesas)
			cola.offer(p);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !cola.isEmpty();
	}

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return cola.poll();
	}

}

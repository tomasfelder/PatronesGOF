package burger_king;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bandeja {
	
	private static Bandeja bandeja = new Bandeja(new ArrayList<Producto>());
	private List<Producto> hamburguesas;
	
	private Bandeja(List<Producto> l){
		hamburguesas = l;
	}
	
	public static Bandeja getInstance(){
		return bandeja;
	}
	
	public void agregarSandwich(Producto p){
		hamburguesas.add(hamburguesas.size(), p);
	}
	
	public Iterator<Producto> iterator(int num){
		if(num == 1){
			return new IteradorOrden(hamburguesas);
		}
		else{
			if(num == 2)
				return new IteradorSalsa(hamburguesas,new ComparadorSalsa());
			else
				return new IteradorSalsa(hamburguesas,new ComparadorCosto());
		}
	}
	
}

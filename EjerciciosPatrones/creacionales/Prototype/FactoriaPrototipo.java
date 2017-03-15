/**
 * 
 */
package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tomasfelder
 *
 */
public class FactoriaPrototipo {

	private Map<String, UnProducto> mapaObjetos;
	private String nombrePorDefecto;
	
	public FactoriaPrototipo(){
		mapaObjetos = new HashMap<String, UnProducto>();
		mapaObjetos.put("producto 1", new UnProducto(1));
	}
	
	public Object create(){
		return create(nombrePorDefecto);
	}

	public Object create(String nombre) {
		nombrePorDefecto = nombre;
		Producto objeto = (Producto)mapaObjetos.get(nombre);
		return objeto!=null ? objeto.clone() : null;
	}
	
}

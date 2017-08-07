package expresiones_aritmeticas;

public class Operando implements Expresion {
	
	private int op;
	
	public Operando(int op){
		this.op=op;
	}
	
	
	public int eval(){
		return op;
	}
	
	@Override
	public String toString(){
		return Integer.toString(op);
	}
	
}

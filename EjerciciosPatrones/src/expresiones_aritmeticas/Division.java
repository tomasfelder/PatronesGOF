package expresiones_aritmeticas;

public class Division implements Expresion {

	private Expresion left,right;
	
	public Division(Expresion l,Expresion r){
		left=l; right=r;
	}
	
	@Override
	public int eval() {
		return left.eval()/right.eval();
	}
	
	@Override
	public String toString(){
		return "("+left.toString()+"/"+right.toString()+")";
	}

}
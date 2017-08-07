package expresiones_aritmeticas;

public class Calculadora {
	
	public static void main(String[] args){
		Expresion exp = new Suma(new Multiplicacion(new Operando(4),new Operando(3)),new Operando(5));
		System.out.println(exp.eval());
	}
	
}

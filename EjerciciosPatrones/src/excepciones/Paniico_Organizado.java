package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Paniico_Organizado {
	
	public static void main(String[] args){
		try {
			System.out.println(leerEnteroTeclado());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int leerEnteroTeclado() throws IOException {
		boolean fin = false;
		int fallos;
		int enteroLeido=-1;
		Scanner sc=new Scanner(System.in);
		for (fallos=0;((fallos<=5) && (fin==false));fallos++){
			try{
				enteroLeido= sc.nextInt();
				fin=true;
			}
			catch(InputMismatchException e){ 
				System.out.println("Un entero!");
			}
		}
		sc.close();
		if (!fin) 
			throw (new IOException());
		return enteroLeido;
	}
}

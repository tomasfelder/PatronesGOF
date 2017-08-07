package aeropuerto_aves;

import java.util.Random;

public class BangController {
	
	public static int checkDetonacion() {
		int[] numeros = new int[2];
		numeros[0]=new Random().nextInt(100)+100;
		numeros[1]=200;
		return numeros[new Random().nextInt(2)];
	}
	
}

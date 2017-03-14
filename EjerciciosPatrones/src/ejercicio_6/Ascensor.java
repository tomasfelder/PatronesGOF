package ejercicio_6;

public class Ascensor {
	
	private boolean parado;
	private int piso_actual;
	
	public Ascensor(){
		piso_actual=0;
		parado=true;
	}
	
	public boolean getParado(){
		return parado;
	}
	
	public void mover_a(int piso){
		parado=false;
		int movimientos=piso-piso_actual;
		if(movimientos<0)
			for(int i=0;i<Math.abs(movimientos);i++)
				mover_abajo();
		else
			for(int i=0;i<movimientos;i++)
				mover_arriba();
		parado=true;
	}

	private void mover_abajo() {
		piso_actual--;
	}

	private void mover_arriba() {
		piso_actual++;
	}
	
}

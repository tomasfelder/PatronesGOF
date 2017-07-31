package excepciones;

public class Ejercicio4 {
	
	public void intentos() throws Exception{
		int intentos=0;
		boolean exito=false;
		while(intentos<10 && !exito){
			try{
				riesgoA();
				exito=true;
			}
			catch(Exception e){
				intentos++;
			}
		}
		if(!exito){
			try{
				controlA();
				throw new Exception();
			}
			catch(Exception e){
				
			}
		}
	}

	private void controlA() {
		// TODO Auto-generated method stub
		
	}

	private void riesgoA() {
		// TODO Auto-generated method stub
		
	}
	
}

package aeropuerto_aves;

public class Aeropuerto {
	
	public static void main(String[] args) {
		IDispositivo s1 = new Sector("S1");
		for(int i=1;i<16;i++)
			s1.agregar(new Dispositivo("D"+i));
		System.out.println(s1.disparar());
		VisitorCodigoError vc = new VisitorCodigoError(200);
		s1.accept(vc);
		System.out.println(vc.etiquetas());
		IDispositivo d20 = new Dispositivo("D20");
		d20.agregar(s1);
	}

}

package detectores_de_humo;

public class Test {
	public static void main(String[] args){
		Central c = Central.getInstance();
		Sala_Grande s = new Sala_Grande();
		s.agregar(new Detector(0));
		s.agregar(new Detector(1));
		s.agregar(new Detector(2));
		c.agregarDetector(new Detector(3));
		c.agregarDetector(new Detector(4));
		c.agregarDetector(new Detector(5));
		c.agregarDetector(s);
		c.encenderDetector(3);
		System.out.println(c.cantDetectores());
		System.out.println(c.indiceSeguridad()*100+"%.");
	}
}

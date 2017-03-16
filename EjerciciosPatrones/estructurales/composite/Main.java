package composite;

public class Main {

	public static void main(String[] args) {
		Sueldo s1 = new Empleado("Juan Perez", 15000);
		Sueldo s2 = new Empleado("Perico Perez", 15000);
		Sueldo s3 = new Empleado("Marisa Gomez", 15000);
		SectorBanco sector = new SectorBanco();
		sector.agrega(s1);
		sector.agrega(s2);
		sector.agrega(s3);
		System.out.print(sector.getSueldo());
	}

}

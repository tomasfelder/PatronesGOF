package iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d =  new Division("Sucursal nº1");
		for(int i=1;i<=10;i++)
			d.add("Empleado "+i);
		for(Empleado e:d){
			System.out.println(e.toString());
		}
	}

}

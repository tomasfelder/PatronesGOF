package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstitutoEducativo ie=InstitutoEducativo.getInstance();
		System.out.println(ie.getNombreInstituto());
	}

}

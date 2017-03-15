package Singleton;

public class InstitutoEducativo {

	private static InstitutoEducativo instancia;
	private String nombreInstituto;
	
	private InstitutoEducativo(){
		nombreInstituto="Universidad Nacional del Sur";
	}
	
	public static InstitutoEducativo getInstance(){
		if(instancia==null)
			instancia=new InstitutoEducativo();
		return instancia;
	}
	
	public String getNombreInstituto(){
		return nombreInstituto;
	}
	
}

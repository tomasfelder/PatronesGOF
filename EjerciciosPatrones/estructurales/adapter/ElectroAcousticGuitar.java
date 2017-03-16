package adapter;

public class ElectroAcousticGuitar implements Guitar {

	private AcousticGuitar acoustic;
	
	public ElectroAcousticGuitar(){
		acoustic=new AcousticGuitar();
	}
	
	@Override
	public void onGuitar() {
		acoustic.play();
	}

	@Override
	public void offGuitar() {
		acoustic.leaveGuitar();
	}

}

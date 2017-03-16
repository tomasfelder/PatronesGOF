package adapter;

public class ElectricGuitar implements Guitar {

	@Override
	public void onGuitar() {
		System.out.println("Playing guitar");
	}

	@Override
	public void offGuitar() {
		System.out.println("I'm tired of playing guitar");
	}

}

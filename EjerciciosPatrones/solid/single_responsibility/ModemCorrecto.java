package single_responsibility;

public class ModemCorrecto implements DataChannel, Connection {

	@Override
	public void dial(String pno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void send(char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public char recv() {
		// TODO Auto-generated method stub
		return 0;
	}

}

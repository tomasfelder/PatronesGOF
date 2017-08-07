package single_responsibility;

public interface ModemViolacionPrincipio {
	public void dial(String pno);
	public void hangup();
	public void send(char c);
	public char recv();
}

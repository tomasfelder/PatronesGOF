package single_responsibility;

public interface DataChannel {
	public void send(char c);
	public char recv();
}

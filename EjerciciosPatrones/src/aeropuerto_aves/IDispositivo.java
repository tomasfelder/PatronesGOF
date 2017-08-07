package aeropuerto_aves;

public interface IDispositivo extends Visitable {
	public void agregar(IDispositivo d);
	public void remover(IDispositivo d);
	public void prender();
	public void apagar();
	public boolean estaPrendido();
	public void recargar();
	public String disparar();
}

package observer;

public class Libro {
	
	private String titulo;
	private String estado;
	
	public Libro(String titulo){
		this.setTitulo(titulo);
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}

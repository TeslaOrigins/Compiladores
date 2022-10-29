package tabela_simbolos;

public abstract class Tipo {
	private Boolean definido;
	private String tipo;
	
	public Boolean getDefinido() {
		return definido;
	}	
	public String getTipo() {
		return tipo;
	}

	public void setDefinido(Boolean definido) {
		this.definido = definido;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

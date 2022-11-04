package tabela_simbolos;

public abstract class Tipo {
	private Boolean atribuido;
	private String tipo;
	private byte[] valor;
	
	public Boolean getAtribuido() {
		return atribuido;
	}	
	public String getTipo() {
		return tipo;
	}

	public void setAtribuido(Boolean atribuido) {
		this.atribuido = atribuido;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public byte[] getValor() {
		return valor;
	}
	public void setValor(byte[] valor) {
		this.valor = valor;
	}
}

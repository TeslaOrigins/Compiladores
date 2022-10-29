package tabela_simbolos;

public class Cadeia extends Tipo {
	private String valor;

	public Cadeia() {
		this.setTipo("cadeia"); 
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}

package tabela_simbolos;

public class Booleano extends Tipo {
	private Boolean valor;

	public Booleano() {
		this.setTipo("booleano"); 
	}
	
	public Boolean getValor() {
		return valor;
	}

	public void setValor(Boolean valor) {
		this.valor = valor;
	}
}

package tabela_simbolos;

public class Real extends Tipo {
	private double valor;

	public Real() {
		this.setTipo("real"); 
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

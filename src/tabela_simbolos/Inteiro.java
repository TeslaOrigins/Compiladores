package tabela_simbolos;

public class Inteiro extends Tipo {
	private int valor;

	public Inteiro() {
		this.setTipo("inteiro"); 
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}

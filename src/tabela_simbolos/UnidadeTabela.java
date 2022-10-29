package tabela_simbolos;

import java.util.Hashtable;

public class UnidadeTabela {
	private Hashtable<String,Tipo> identificadores;

	public void adicionaIdentificador(String nome, Tipo tipo) {
		
	}
	
	public Hashtable<String,Tipo> getIdentificadores() {
		return identificadores;
	}

	public void setIdentificadores(Hashtable<String,Tipo> identificadores) {
		this.identificadores = identificadores;
	}
}

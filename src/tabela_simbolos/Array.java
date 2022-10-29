package tabela_simbolos;

import java.util.ArrayList;

public class Array extends Tipo {
	private ArrayList<Tipo> valor;
	private ArrayList<Integer> tamanhos;
	private int dimensao;

	public Array(String tipoArray, ArrayList<Integer> tamanhos, int dimensao) {
		this.setTipo(tipoArray); 
	}
	
	public ArrayList<Tipo> getValor() {
		return valor;
	}
	public ArrayList<Integer> getTamanhos() {
		return tamanhos;
	}
	public int getDimensao() {
		return dimensao;
	}

	public void setValor(ArrayList<Tipo> valor) {
		this.valor = valor;
	}
	public void setTamanhos(ArrayList<Integer> tamanhos) {
		this.tamanhos = tamanhos;
	}
	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}	
}

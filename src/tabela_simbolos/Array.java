package tabela_simbolos;

import java.util.List;

public class Array extends Tipo {
	private List<Integer> tamanhos;
	private int dimensao;
	public Array(String tipoArray, List<Integer> tamanhos, int dimensao) {
		this.setTipo(tipoArray); 
	}
	public Array(String tipoArray) {
		this.setTipo(tipoArray); 
	}
	
	public List<Integer> getTamanhos() {
		return tamanhos;
	}
	public int getDimensao() {
		return dimensao;
	}


	public void setTamanhos(List<Integer> tamanhos) {
		this.tamanhos = tamanhos;
	}
	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}	
}

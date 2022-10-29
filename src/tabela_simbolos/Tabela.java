package tabela_simbolos;

import sarapatel.analysis.DepthFirstAdapter;
import java.util.Stack;

public class Tabela extends DepthFirstAdapter
{
	private Stack<UnidadeTabela> pilha;
	
	public Tabela() {
		setPilha(new Stack<UnidadeTabela>());
	}
	
	public void percorrerArvore() {
		
	}

	public Stack<UnidadeTabela> getPilha() {
		return pilha;
	}

	public void setPilha(Stack<UnidadeTabela> pilha) {
		this.pilha = pilha;
	}
}

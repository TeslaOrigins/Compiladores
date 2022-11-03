package tabela_simbolos;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.ADecCons;
import sarapatel.node.ADecFuncao;
import sarapatel.node.ADecProcedimento;
import sarapatel.node.ADecVar;
import sarapatel.node.AParametro;
import sarapatel.node.Start;
import java.util.Stack;

public class Tabela extends DepthFirstAdapter
{
	private Stack<UnidadeTabela> pilha;
	
	public Tabela() {
		UnidadeTabela Global = new UnidadeTabela();
		pilha = new Stack<UnidadeTabela>();
		pilha.add(Global);
	}
	
	@Override
	public void inStart(Start node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando an�lise sem�ntica...");
		System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void outStart(Start node) {
		System.out.println("-------------------------------------------------");
        System.out.println("Fim da an�lise sem�ntica");
        exibe();
        System.out.println("-------------------------------------------------");
	}

	public Stack<UnidadeTabela> getPilha() {
		return pilha;
	}

	public void setPilha(Stack<UnidadeTabela> pilha) {
		this.pilha = pilha;
	}
	
	@Override
	public void outAParametro(AParametro node) {
		System.out.println("-------------------------------------------------");
		//System.out.println("nome:" + node.toString());
		System.out.println("tipo Parametro: "+node.getTipoParametro());
		System.out.println("id: "+node.getIdentificador());
		
		pilha.lastElement().adicionaIdentificador(node.getIdentificador().toString(),node.getTipoParametro().toString());
				
        //System.out.println("A��es a serem tomadas na tabela de s�mbolos:");
	}
	@Override
	public void inADecProcedimento(ADecProcedimento node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Nome do procedimento: "+node.getIdentificador());
		
		// Pega o escopo de maior prioridade no momento (global), e coloca a funcao dentro da lista de variaveis
		// do escopo
		pilha.lastElement().adicionaIdentificador(node.getIdentificador().toString(), null);
		// Cria um novo escopo
		UnidadeTabela x = new UnidadeTabela();
		// Adiciona este escopo a stack de escopos
		pilha.add(x);
	}
	
	@Override
	public void outADecProcedimento(ADecProcedimento node) {
		System.out.println("-----------------FECHANDO ESCOPO----------------------");
		System.out.println("Nome do Procedimento: "+node.getIdentificador());
		System.out.println("--------------------Variaveis--------------------");
		for(String chave : pilha.lastElement().getIdentificadores().keySet()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Nome da Vari�vel: "+ chave);
			System.out.println("Tipo da Vari�vel: " + pilha.lastElement().getIdentificadores().get(chave).getTipo().toString());
		}
		//Escopos.pop();
		
	}
	@Override
	public void inADecFuncao(ADecFuncao node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Nome da fun��o: "+node.getIdentificador());
		System.out.println("Tipo da fun��o: "+node.getTipo().toString());
		// Pega o escopo de maior prioridade no momento (global), e coloca a funcao dentro da lista de variaveis
		// do escopo
		pilha.lastElement().adicionaIdentificador(node.getIdentificador().toString(),node.getTipo().toString());
		// Cria um novo escopo
		UnidadeTabela x = new UnidadeTabela();
		// Adiciona este escopo a stack de escopos
		pilha.add(x);
	}
	
	@Override
	public void outADecFuncao(ADecFuncao node) {
		System.out.println("-----------------FECHANDO ESCOPO----------------------");
		System.out.println("Nome da fun��o: "+node.getIdentificador());
		System.out.println("--------------------Variaveis--------------------");
		for(String chave : pilha.lastElement().getIdentificadores().keySet()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Nome da Vari�vel: "+ chave);
			System.out.println("Tipo da Vari�vel: "+ pilha.lastElement().getIdentificadores().get(chave).getTipo().toString());
		}
		//Escopos.pop();
		
	}
		
	@Override
	public void outADecVar(ADecVar node) {
		System.out.println("Declara��o de variaveis:");
		boolean atribuido = node.getIdentificadorComOuSemAtribuicao().toString().contains("<<");
		String[] id = node.getIdentificadorComOuSemAtribuicao().toString().split("<<",-2);
		System.out.println("id: "+id[0]);
		System.out.println("tipo: "+node.getTipo().toString());
		System.out.println("-------------------------------------------------");
		pilha.lastElement().adicionaIdentificador(id[0],node.getTipo().toString());
	}
	
	@Override
	public void outADecCons(ADecCons node) {
		System.out.println("-------------------------------------------------");
		String[] id = node.getIdAtribuicao().toString().split("<<",-2);
		System.out.println("Declara��o de constante");
		System.out.println("id: "+id[0]);
		System.out.println("tipo: "+node.getTipo().toString());
		System.out.println("-------------------------------------------------");
		
		pilha.lastElement().adicionaIdentificador(id[0],node.getTipo().toString());
		
	}
	public void exibe(){
		System.out.println("===================================");
		System.out.println("Tabela de simbolos: "+this.pilha.size());
		System.out.println("===================================");
	}
}

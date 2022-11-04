package tabela_simbolos;

import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.node.ABlocoComandos;
import sarapatel.node.ADecCons;
import sarapatel.node.ADecFuncao;
import sarapatel.node.ADecProcedimento;
import sarapatel.node.ADecVar;
import sarapatel.node.AIdAtribuicao;
import sarapatel.node.AParametro;
import sarapatel.node.Start;

import java.util.Hashtable;
import java.util.Stack;

public class Tabela extends DepthFirstAdapter
{
	private Stack<UnidadeTabela> pilha;
	
	public Stack<UnidadeTabela> getPilha() {
		return pilha;
	}

	public void setPilha(Stack<UnidadeTabela> pilha) {
		this.pilha = pilha;
	}
	
	public Tabela() {
		UnidadeTabela Global = new UnidadeTabela();
		pilha = new Stack<UnidadeTabela>();
		pilha.add(Global);
	}
	
	@Override
	public void inStart(Start node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando análise semántica...");
		System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void outStart(Start node) {
		System.out.println("-------------------------------------------------");
        System.out.println("Fim da análise semántica");
        System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void inABlocoComandos(ABlocoComandos node)
	{
		System.out.println("--------------------- Adicionando bloco ao escopo----------------------------");
		
		// Cria um novo escopo
		UnidadeTabela x = new UnidadeTabela();
		// Adiciona este escopo a stack de escopos
		pilha.add(x);
		
		exibe();
	}
	
	@Override
	public void outABlocoComandos(ABlocoComandos node)
	{
		System.out.println("-----------------FECHANDO ESCOPO (BLOCO)----------------------");
		
		System.out.println("--------------------Variaveis--------------------");
		for(String chave : pilha.lastElement().getIdentificadores().keySet()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Nome da Variável: "+ chave);
			System.out.println("Tipo da Variável: " + pilha.lastElement().getIdentificadores().get(chave).getTipo().toString());
		}
		pilha.pop();
		exibe();
	}
	
	
	@Override
	public void outAParametro(AParametro node) {
		System.out.println("-------------------------------------------------");
		//System.out.println("nome:" + node.toString());
		System.out.println("tipo Parametro: "+node.getTipoParametro());
		System.out.println("id: "+node.getIdentificador());
		
		pilha.lastElement().adicionaIdentificador(node.getIdentificador().toString(),node.getTipoParametro().toString());
				
        //System.out.println("Açães a serem tomadas na tabela de simbolos:");
		exibe();
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
		exibe();
	}
	
	@Override
	public void outADecProcedimento(ADecProcedimento node) {
		System.out.println("-----------------FECHANDO ESCOPO----------------------");
		System.out.println("Nome do Procedimento: "+node.getIdentificador());
		System.out.println("--------------------Variaveis--------------------");
		for(String chave : pilha.lastElement().getIdentificadores().keySet()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Nome da Variável: "+ chave);
			System.out.println("Tipo da Variável: " + pilha.lastElement().getIdentificadores().get(chave).getTipo().toString());
		}
		pilha.pop();
		exibe();
	}
	
	@Override
	public void inADecFuncao(ADecFuncao node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Nome da função: "+node.getIdentificador());
		System.out.println("Tipo da função: "+node.getTipo().toString());
		// Pega o escopo de maior prioridade no momento (global), e coloca a funcao dentro da lista de variaveis
		// do escopo
		pilha.lastElement().adicionaIdentificador(node.getIdentificador().toString(),node.getTipo().toString());
		// Cria um novo escopo
		UnidadeTabela x = new UnidadeTabela();
		// Adiciona este escopo a stack de escopos
		pilha.add(x);
		exibe();
	}
	
	@Override
	public void outADecFuncao(ADecFuncao node) {
		System.out.println("-----------------FECHANDO ESCOPO----------------------");
		System.out.println("Nome da função: " + node.getIdentificador());
		System.out.println("--------------------Variaveis--------------------");
		for(String chave : pilha.lastElement().getIdentificadores().keySet()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Nome da Variável: "+ chave);
			System.out.println("Tipo da Variável: "+ pilha.lastElement().getIdentificadores().get(chave).getTipo().toString());
		}
		pilha.pop();
		exibe();
	}
		
	@Override
	public void outADecVar(ADecVar node) {
		System.out.println("Declaração de variaveis:");
		boolean atribuido = node.getIdentificadorComOuSemAtribuicao().toString().contains("<<");
		String[] id = node.getIdentificadorComOuSemAtribuicao().toString().split("<<",-2);
		System.out.println("id: "+id[0]);
		System.out.println("tipo: "+node.getTipo().toString());
		System.out.println("-------------------------------------------------");
		pilha.lastElement().adicionaIdentificador(id[0],node.getTipo().toString());
		exibe();
	}
	
	@Override
	public void outADecCons(ADecCons node) {
		System.out.println("-------------------------------------------------");
		String[] id = node.getIdAtribuicao().toString().split("<<",-2);
		System.out.println("Declaração de constante");
		System.out.println("id: "+id[0]);
		System.out.println("tipo: "+node.getTipo().toString());
		System.out.println("-------------------------------------------------");
		
		pilha.lastElement().adicionaIdentificador(id[0],node.getTipo().toString());
		exibe();
	}
	
	@Override
    public void outAIdAtribuicao(AIdAtribuicao node)
    {
		System.out.println("------------------------- ATRIBUINDO ------------------------");
		System.out.println("Nome da variavel sendo atribuida: "+ node.getIdentificador());
		int i;
		boolean achou = false;
		// pega a variavel existente em todos os escopos no 
		for(i = 0;i < pilha.size();i++) {
			if(pilha.get(i).getIdentificadores().get(node.getIdentificador().toString()) != null)
			{
				pilha.get(i).getIdentificadores().get(node.getIdentificador().toString()).setAtribuido(true);
				achou = true;
				break;
			}
		}
		if(!achou) {
			System.out.println("Variavel não esta em algum dos escopos!");
		}
		exibe();
    }
    
	public void exibe(){
		String p = "[";
		for(int i = 0; i < pilha.size(); i++) {
			p += " { ";
			for(String s : pilha.get(i).getIdentificadores().keySet()) {
				p += s + " : " + pilha.get(i).getIdentificadores().get(s).getTipo() + " , ";
			}
			p += " }, ";
		}
		p += "]";
		System.out.println("===================================");
		System.out.println("Tabela de simbolos no momento atual: "+ p);
		System.out.println("===================================");
	}
}

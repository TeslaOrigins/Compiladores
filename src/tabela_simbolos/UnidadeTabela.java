package tabela_simbolos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnidadeTabela {
	private Hashtable<String,Tipo> identificadores;
	public UnidadeTabela() {
		this.identificadores = new Hashtable<String,Tipo>();
	}
	public void adicionaIdentificador(String nome, String tipo) {
		Tipo t;
		//Se for aray
		if(tipo == null) {
			t = null;
		}else {
			if(tipo.contains("[")) {
				// dimensoes do array
				//int dim = this.countOccurences(tipo, '[', 0);
				/*
				// achar tamanho das dimensoes
				String str = tipo.replaceAll("[^-?0-9]+", " "); 
				List<Integer> listaTamanhos = new ArrayList<Integer>();
				
				// lista de tamanho das dimensões ex : int[1][3][4] => 1,3,4
				for(String s : str.trim().split(" ")) listaTamanhos.add(Integer.valueOf(s));
				*/
				
				if(tipo.contains("inteiro")) {
					t = new Array("arrayinteiro");
				}
				if(tipo.contains("cadeia")) {
					t = new Array("arraycadeia");
				}
				if(tipo.contains("real")) {
					t = new Array("arrayreal");
				}
				if(tipo.contains("booleano")) {
					t = new Array("arraybooleano");
				}
			//se nao for array
			}else {
				if(tipo.contains("inteiro")) {
					t = new Inteiro();
				}
				if(tipo.contains("cadeia")) {
					t = new Cadeia();
				}
				if(tipo.contains("real")) {
					t = new Real();
				}
				if(tipo.contains("booleano")) {
					t = new Booleano();
				}
			}
		}
	
	}
	public int countOccurences(
			  String someString, char searchedChar, int index) {
			    if (index >= someString.length()) {
			        return 0;
			    }
			    
			    int count = someString.charAt(index) == searchedChar ? 1 : 0;
			    return count + countOccurences(
			      someString, searchedChar, index + 1);
			}
	public Hashtable<String,Tipo> getIdentificadores() {
		return identificadores;
	}

	public void setIdentificadores(Hashtable<String,Tipo> identificadores) {
		this.identificadores = identificadores;
	}
}

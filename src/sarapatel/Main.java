package sarapatel;
import sarapatel.parser.*;
import tabela_simbolos.Tabela;
import sarapatel.lexer.*;
import sarapatel.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "teste/codigo_1.srptl";
   Lexer lexer =
			new Lexer(
					new PushbackReader(  
							new FileReader(arquivo), 1024)); 
	Parser p = new Parser(lexer); 
	   
	   Start tree = p.parse();
	   //Imprime árvore na saída padrão
	  // tree.apply(new ASTDisplay());
	   tree.apply(new Tabela());
	   Tabela sa = new Tabela();
	   System.out.println("-----Tabela de simbolos-----");
	   sa.exibe();
	   System.out.println("-------------------------");
//	String arquivo = "teste/teste2.srptl";
//
//	Lexer lexer =
//			new Lexer(
//					new PushbackReader(  
//							new FileReader(arquivo), 1024)); 
//	Token token;
//	while(!((token = lexer.next()) instanceof EOF)) {
//		System.out.println(token.getClass());
//		System.out.println(" ( "+token.toString()+")");
//	}

} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
}

}

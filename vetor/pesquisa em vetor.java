/******************************************************************************

Escreva um programa para receber o nome de 5 pessoas em um vetor. Depois
receber o nome de uma pessoa, pesquisar este nome no vetor e mostrar:
Se encontrar: Pessoa encontrada
Se não encontrar: Pessoa não encontrada

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner (System.in);
	   String nomePesquisado = "Sem nome";
	   
	   String nome [] = new String[5];
	   
	    for (int i=0; i<5; i++){
	  
	    	System.out.printf("Escreva o nome da %d pessoa: ", i+1);
		    nome[i]  = scanner.nextLine();
		
	    }
	    
	    System.out.println("Pesquise o nome de uma das 5 pessoas que você digitou: ");
	    String pesquisaNome = scanner.nextLine();
	    
	    for (int i=0; i<5;i++){
	
	       if(pesquisaNome.equals(nome[i])){
	          nomePesquisado = pesquisaNome;
	       } 
	       
	    }
	    
	   if(nomePesquisado.equals(pesquisaNome)){
	       System.out.println("Pessoa encontrada");
	   }else{
	       System.out.println("Pessoa não encontrada");
	   }
	  
	}
}


/******************************************************************************

Problema: Ordenar alfabeticamente os nomes de flores.
Requisitos: Como vendedor da loja de flores eu gostaria que 
o sistema leia o nome de 3 flores e mostre os nomes em ordem alfabética.

Recomendação: Não utilizar estrutura de repetição nem vetor.

Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da 1º flor");
		String primeiraFlor = scanner.nextLine();
		
		System.out.println("Digite o nome da 2º flor");
		String segundaFlor = scanner.nextLine();
		
		System.out.println("Digite o nome da 3º flor");
		String terceiraFlor = scanner.nextLine();
		
		if ((primeiraFlor).compareTo(segundaFlor) <0 && (primeiraFlor).compareTo(terceiraFlor) <0){
		    if((terceiraFlor).compareTo(segundaFlor)<0){
		        System.out.println(primeiraFlor+","+terceiraFlor+","+ segundaFlor);
		    }else{
		         System.out.println(primeiraFlor+","+segundaFlor+","+ terceiraFlor);
		    }
		    
		}
		else if ((segundaFlor).compareTo(primeiraFlor) <0 && (segundaFlor).compareTo(terceiraFlor) <0){
		    if((terceiraFlor).compareTo(primeiraFlor)<0){
		        System.out.println(segundaFlor+","+terceiraFlor+","+ primeiraFlor);
		    }else{
		        System.out.println(segundaFlor+","+primeiraFlor+","+ terceiraFlor);
		    }
		}
	
		else {
		    
		    if((primeiraFlor).compareTo(segundaFlor)<0){
		       System.out.println(terceiraFlor+","+primeiraFlor+","+ segundaFlor); 
		    }else{
		       System.out.println(terceiraFlor+","+segundaFlor+","+ primeiraFlor); 
		    }
		}
	}
}



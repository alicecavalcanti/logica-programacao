/******************************************************************************

Escreva um programa para receber a média de cada aluno de uma turma com 5 alunos.
No final mostrar a média geral da turma.

Obs.: Utilizar estrutura de repetição para receber as médias dos alunos na mesma variável.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int quantidadeMedia = 0;
	    int media = 0;
	    int mediaTotal=0;
	    
	    Scanner scanner = new Scanner(System.in); 
	   
	    do{
	        System.out.println("Digite a media do aluno");
	        media = scanner.nextInt();
	        quantidadeMedia = quantidadeMedia + 1;
	        mediaTotal = mediaTotal + media;
	    }
		while (quantidadeMedia<5);
		   
		System.out.println("A média geral é " + mediaTotal/5);
		
		   
	}	   
}


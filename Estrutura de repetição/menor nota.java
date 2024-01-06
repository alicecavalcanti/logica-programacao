/******************************************************************************

Escreva um programa para receber a nota de 6 alunos (usar estrutura de repetição para as entradas).
No final mostrar a menor nota.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		System.out.println("Digite a nota de 6 alunos ");
		int contador = 0, repetidor = 1, menorNota = 0;
		
		do{
		    contador++;
		    
		    System.out.printf("%dº nota: ", contador);
		    int notasAlunos = scanner.nextInt();
		    
		    if(contador == 1){
		        menorNota = notasAlunos;
		    }
		    else{
                if(menorNota <= notasAlunos){
                    menorNota = menorNota;
                }else{
                    menorNota = notasAlunos;
                }		        
		    }
		}while(contador < 6);
	
	    System.out.print("A menor nota é " + menorNota );
	}
	
}

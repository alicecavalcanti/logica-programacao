import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto= new Scanner (System.in);
	    int troca;
		System.out.println("Digite o primeiro número: ");
		int primeiroValor= objeto.nextInt();
		System.out.println("Digite o segundo número: ");
		int segundoValor = objeto.nextInt();
		
		if(primeiroValor > segundoValor){
		    
		    troca = segundoValor;
		    segundoValor= primeiroValor;
		    primeiroValor=troca;
		}
		System.out.println("O primeiro valor é "+ primeiroValor+ 
		" e o segundo valor é "+ segundoValor);
	}
}
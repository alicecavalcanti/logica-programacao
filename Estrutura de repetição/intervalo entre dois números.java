/******************************************************************************

Escreva um programa para:
Receber dois números inteiros positivos. Considerar que o usuário sempre vai digitar números inteiros positivos.
Criticar para só aceitar os números se o primeiro número for menor que o segundo número.
Mostrar todos os números ímpares do primeiro ao último número informado.


Obs.: Utilizar apenas as estruturas e instruções da linguagem Java que estudamos até o momento.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int segundoNumero = scanner.nextInt();
		
		int restoDivisaoPor2 = primeiroNumero%2;
		if(primeiroNumero>segundoNumero){
		    System.out.print("Erro. O primeiro número precisa ser menor que o segundo número");
		}
		else if(restoDivisaoPor2 != 0){
		    
		   System.out.print("Os números ímpares desse intervalo são: ");
		   
		    do{
		        System.out.print(primeiroNumero);
		        primeiroNumero = primeiroNumero + 2;
		        System.out.print(" , ");
		    }
		    while(primeiroNumero <=  segundoNumero);
		    
		}else{
		    primeiroNumero++;
		    
		    System.out.print("Os números ímpares desse intervalo são: ");
		    
		   do{ 
		       System.out.print(primeiroNumero);
		       primeiroNumero = primeiroNumero + 2;
		       System.out.print(" , ");
		       
		   }while(primeiroNumero <= segundoNumero);
		   
		  
		    }
		}
	}

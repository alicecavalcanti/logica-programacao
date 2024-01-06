/******************************************************************************
Escreva um programa para receber a idade de 5 pessoas (usar estrutura de repetição para as entradas).
No final mostrar a maior idade.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int idadeMaior = 0, idade = 0, contadorIdade =0, contador = 1;
	    
	    System.out.println("Digite a idade de 5 pessoas ");
	    
	    do{
	        contadorIdade = contadorIdade + 1 ;
	        System.out.printf("%dº idade: ", contadorIdade); 
	        idade = scanner.nextInt();
	        
	        if(idadeMaior>idade){
	           idadeMaior = idadeMaior;
	        }
	        else{
	            idadeMaior = idade;
	        }
	        contador++;
	        
	    }while (contador <= 5);
		System.out.print("A maior idade é: " + idadeMaior);
	}
}


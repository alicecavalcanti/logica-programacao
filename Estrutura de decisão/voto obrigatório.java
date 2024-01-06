/******************************************************************************

Escreva um programa para receber a idade de uma pessoa. Informar quando a pessoa é obrigado a votar.

Aluna: Alice Pereira
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    
	    int idade;
	    
	    Scanner objeto = new Scanner(System.in);
	    
		System.out.println("Digite a sua idade: ");
		idade= objeto.nextInt();
		
		
		if(idade>=18 && idade<=69 ){
		    System.out.print("Você é obrigado a votar");
		}else{
		    System.out.print("Voto obrigatório de 18 a 69 anos");
		}
		
		}
	}
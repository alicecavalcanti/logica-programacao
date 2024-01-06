/******************************************************************************

Escreva um programa pra receber a idade é informa se a pessoa é ou não maior de idade.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    
	    int idade;
	    
	    Scanner objeto = new Scanner(System.in);
	    
		System.out.println("Digite a sua idade: ");
		idade= objeto.nextInt();
		
		
		if(idade>=18 ){
		    System.out.print("Você é maior de idade");
		}else{
		    System.out.print("Você não é maior de idade");
		}
		
	}
}
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro nome: ");
		String primeiroNome  = scanner.nextLine();
		
		System.out.print("Digite o segundo nome: ");
		String segundoNome  = scanner.nextLine();
		String terceiroNome = primeiroNome  ;
	
		if(segundoNome.compareTo(primeiroNome) < 0){
		    primeiroNome = segundoNome;
		    segundoNome = terceiroNome;
		}
	
	    System.out.print("O primeiro nome é " + primeiroNome+ " e o segundo nome é "+  segundoNome);
        }
	}  


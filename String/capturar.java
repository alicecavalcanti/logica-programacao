import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.println("Escreva algo: ");
		String texto = scanner.nextLine();
		
		texto = texto.toUpperCase().substring(0, 1) + texto.toLowerCase().substring(1);
	
		System.out.println(texto);
	}
	
}


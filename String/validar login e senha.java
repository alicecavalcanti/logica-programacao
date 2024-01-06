import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Digite o Login do usuário: ");
		String login = scanner.nextLine(); 
		
		System.out.print("Digite a senha do usuário: ");
		String senha = scanner.nextLine();
		
		if(login.equals(senha)){
		    System.out.print("Registro não aceito: o login e a senha não podem ser iguais");
		}
		else{
		    System.out.print("Registro aceito");
		}
	}
}




import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto= new Scanner(System.in);
	    int dia;
	    
		System.out.println( "1- Domingo \n 2- Segunda\n 3- terça\n 4- Quarta \n 5- Quinta\n 6-Sexta\n 7- Sábado  " + 
		"\nDigite o número que corresponde ao dia que você deseja: \n" );
		dia = objeto.nextInt();
		if(dia== 1 || dia ==7){
		    System.out.println("Esse dia é final de semana");
		}else{
		    System.out.println("é dia de semana");
		}
		
		
	}
}
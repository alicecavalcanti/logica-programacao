/******************************************************************************

Elabora um programa para ler dois números inteiros representando hora e minutos respectivamente. 
Mostrar se a hora ou o minuto são inválidos (devem ser positivos, a hora até 23 e o minuto até 59).
*******************************************************************************/
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite a hora: ");
		int hora = scanner.nextInt();
		
		System.out.println("Digite os minuto: ");
		int minuto = scanner.nextInt();
		
		if(hora > 23 ){
		    System.out.println(" Hora inválida. Essa hora não existe ");
		}
		if(minuto>59){
		     System.out.println(" Minuto inválido. Esse minuto não existe ");
		}
		if(hora<0 || minuto <0){
		    System.out.println(" inválido. Tempo não pode ser negativo ");
		}
	}
}


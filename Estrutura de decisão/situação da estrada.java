/******************************************************************************

Um letreiro deverá mostrar se uma estrada está liberada ou bloqueada, baseado na temperatura do dia e na temperatura média.
A estrada deve ser bloqueada sempre que a temperatura do dia é inferior à temperatura média ou quando a temperatura do dia 
e a temperatura média são negativas.

Elabore um programa para ler a temperatura do dia e a temperatura média e mostrar a situação da estrada.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.print("Digite a temperatura do dia ");
		int TemperaturaDia = scanner.nextInt();
		
		System.out.print("Digite a temperatura média  ");
		int TemperaturaMedia = scanner.nextInt();
		
		if(TemperaturaDia < TemperaturaMedia || TemperaturaDia < 0 && TemperaturaMedia < 0){
		    
		System.out.print("A estrada está bloqueada");
		
		}else {
		    
		System.out.print("A estrada está liberada");
	    
		}	
	}	
}

/******************************************************************************
Os  moradores de um vilarejo mantêm uma superstição e decreta feriado sempre que o mês inicia com temperatura negativa.

Elabore um programa para ler o dia do mês e a temperatura do dia e mostrar “Feriado decretado” sempre que for início de um mês e a temperatura seja negativa.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto = new Scanner(System.in);
		System.out.println("Digite o dia do mês que você deseja? ");
		int dia = objeto.nextInt();
		
		System.out.println("Digite a temperatura");
		int temperatura = objeto.nextInt();
		
		if (dia == 1 && temperatura < 0 ){
		    System.out.println("Feriado decretado");
		    
		}
	}
}

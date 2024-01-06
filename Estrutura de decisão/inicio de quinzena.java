/******************************************************************************
Elabore um programa que leia o dia do mês e informe se é o início de uma quinzena do mês.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto = new Scanner(System.in);
		System.out.println("Digite o dia do mês que você deseja? ");
		int dia = objeto.nextInt();
		
		if (dia == 1 || dia == 16 ){
		    System.out.println("É o início de uma quinzena");
		    
		}
	}
}


/******************************************************************************
Um grupo de pessoas decidiu dedicar-se a realização de ações sociais nos finais de semanas de meses pares.

Elabore um programa que leia o número do dia (1-domingo; 2-segunda,...) e o número do mês e mostre: “Não é final de semana”,
“Final de semana de ações sociais” ou “Final de semana livre”, de acordo com a decisão do grupo.

Obs.: Final de semana (Sábado e domingo).



*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto = new Scanner(System.in);
	    
		System.out.print(" 1- Domingo \n 2 - Segunda \n 3- Terça \n 4- Quarta" +
		"\n 5 - Quinta \n 6- Sexta \n 7- Sábado \n\n Digite que corresponde ao dia da semana que você deseja ? ");
		int diaDaSemana = objeto.nextInt();
		
	    System.out.print("\n1 - 12 equivale a janeiro até dezembro.\nDigite o número que corresponde ao mês que você deseja:\n ");
	    int mes = objeto.nextInt();
		int restoDaDivisao = mes % 2;
		 
    	if (restoDaDivisao == 0 && diaDaSemana == 1 || restoDaDivisao == 0 && diaDaSemana == 7  ){
		    System.out.println("\nFinal de semana de ações sociais ");
		    
    	}else if(restoDaDivisao != 0 && diaDaSemana == 1 || restoDaDivisao != 0 && diaDaSemana == 7) {                                                                                            
    	    System.out.println("\nFinal de semana livre");
    	    
    	}else if(diaDaSemana < 7 && diaDaSemana > 1  ){
    	 System.out.println("\nNão é final de semana");   
    	}
		
	}
}

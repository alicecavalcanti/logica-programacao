/******************************************************************************
O registro de fluxo de caixa do departamento financeiro de uma empresa registra sempre o número do dia anterior e o número do dia atual  (...; 27, 28; 28, 29; 29, 30; 30, 1; 1, 2; 2, 3; ...).
Elabore um programa para ler o registro de um dia (número do dia anterior e número do dia atual) e mostrar se os números dos dias informado determina ser do mesmo mês ou ser um novo mês.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner objeto = new Scanner(System.in);
		System.out.println("Digite a data de hoje ");
		int diaAtual = objeto.nextInt();
		System.out.println("Digite a data de ontem");
		int diaAnterior = objeto.nextInt();
	
		
    	if (diaAtual ==  1 && diaAnterior == 30 || diaAnterior == 28 || diaAnterior == 31 ){
		    System.out.println("Esses dias são de meses diferentes ");
		    
    	}else {
    	    System.out.println("São dias do mesmo mês");
    	}  
		
		
	}
}


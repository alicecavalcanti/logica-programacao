/******************************************************************************
Uma das formulas para calcular a potência elétrica é:
U (tensão elétrica) ao quadrado dividido por R (resistência
elétrica).

Escreva um programa para receber a tensão e a resistência
elétrica e mostrar a potência.

Obs.: Não será aceito link para arquivo compartilhado,
arquivo compactado nem imagem.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); 
	    
		System.out.print("Digite o valor da tensão elétrica: ");
		int tensaoEletrica = scanner.nextInt();
		
		System.out.print("Digite o valor da resistência elétrica: ");
		int resistenciaEletrica = scanner.nextInt();
		
		double potenciaeletrica = Math.pow(tensaoEletrica, 2) / resistenciaEletrica;
		System.out.println("O valor da potência elétrica é " + potenciaeletrica);
	}
}



/******************************************************************************

Questão 04: Arredondamento personalizado
Escreva um programa para arredondar uma nota informada, sendo:

• Se a parte decimal for até .2, arredondar para baixo. Exemplo: 8.1 => 8
• Se a parte decimal for a partir de .8, arredondar para cima. Exemplo: 5.8 => 6
• Outro valores, arredondar para .5. exemplos: 7.4 ou 7.7 => 7,5

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.println("Digite uma nota: ");
		double nota = scanner.nextDouble();
		
		
		final double PARTE_DECIMAL = nota - (int) nota ;
		
		
		if (0 < PARTE_DECIMAL && PARTE_DECIMAL <= 2 ){
		    
		    System.out.print(Math.floor(nota));
	
	    }else if(PARTE_DECIMAL >= 8){
	        System.out.print(Math.ceil(nota));
	    }else{
	        double notaArredondadaPara0_5 = (int) nota + 0.5; 
	        System.out.print(notaArredondadaPara0_5);
	    }
    }
}


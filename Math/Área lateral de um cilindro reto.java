/******************************************************************************
Área de um cilindro circular reto: A(lat)=2πrh, onde r é o raio da base e h é a altura do cilindro.

Para maiores detalhes leia  o link indicado em anexo.

Escreva um programa para receber os dados necessários e mostrar a área lateral do cilindro reto.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    final double PI = 3.14;
	    
		System.out.print("Digite o valor da base: ");
		int baseCilindro = scanner.nextInt();
		
		System.out.print("Digite o valor da altura: ");
        int alturaCilindro = scanner.nextInt();
        
        double areaLateral = PI * baseCilindro * alturaCilindro;
        System.out.print("A área lateral é "+ areaLateral);
        
	}
}


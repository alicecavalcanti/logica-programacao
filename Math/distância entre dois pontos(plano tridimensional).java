/******************************************************************************

A distância entre dois pontos em um plano tridimensional é dada pela raiz quadrada 
da soma da distância ao quadrado de cada distância do ponto um até o  ponto dois em
cada uma das três coordenadas.

Escreva um programa para receber a distância do ponto um até o ponto dois em cada uma
das três coordenadas e mostrar a distância entre os pontos no plano tridimensional.

Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.
2 2 2
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int pontosPlano[] = new int[3];
		
		for(int i= 0; i<3;i++ ){
		    System.out.printf("Digite a distância entre os %dº dois pontos: ", i+1 );
		    pontosPlano[i] = scanner.nextInt(); 
		}
		
		int ponto1= 2;
		int ponto2= 3;
		int ponto3= 4;
		
		double somaPontos = Math.pow(pontosPlano[0],2) + Math.pow(pontosPlano[1],2) + Math.pow(pontosPlano[2],2);
		double raizSomaPontos = Math.sqrt(somaPontos);
		System.out.print("A distância entre os pontos no plano tridimensional é "+raizSomaPontos);
	}

}


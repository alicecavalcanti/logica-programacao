/******************************************************************************
Questão 02: Manipulação de elementos do vetor
Considere o vetor abaixo e elabore um programa para mostrar o seguinte:

[0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
8 17 25 50 14 19 28 77 85 45

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int vetor [] = {8, 17, 25, 50, 2, 19, 28, 77, 85, 45};
		int ordenandoVetor;
		int menorValorArray = 0;
		
		// a) Os valores armazenados nas posições pares. (8, 25, 14, 28, 85)
		System.out.print("\na) Os valores armazenados nas posições pares\n");
		for(int i= 0; i<vetor.length;i++){
		    if(0 == i%2){
		        System.out.print(vetor[i] + "/");
		    }
		}
		
		//b) Os valores pares. (8, 50, 14, 28)
		System.out.print("\n\nb) Os valores pares.\n");
		for(int i= 0; i<vetor.length;i++){
		    if(0 == vetor[i]%2){
		        System.out.print(vetor[i] + "/");
		    }
		}
		
		//c) Os valores armazenados das posições 9 a 0. (45, 85, 77, 28, 19, 14, 50, 25, 17, 8)
		System.out.print("\n\nc)Os valores armazenados das posições 9 a 0.\n");
		for(int i =9; i>=0; i--){
		    System.out.print(vetor[i] + "/");
		}
		
		//d) Os valores armazenados das posições 4 a 8. (14, 19, 28, 77, 85)
		System.out.print("\n\nd) Os valores armazenados das posições 4 a 8.\n");
		for(int i = 4; i<=8; i++ ){
		    System.out.print(vetor[i] + "/");
		}
		
	
	}
}
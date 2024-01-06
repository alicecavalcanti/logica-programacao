import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String texto;
		int contador = 0;
		
		System.out.println("Insira o texto: ");
		texto = input.nextLine();
		
		// Variavel para sinalizar se está dentro ou fora da palavra
		boolean dentroPalavra = false; // inicia fora da palavra
		char caractere;
		
		for (int i = 0; i < texto.length(); i++){
		    caractere = texto.charAt(i);
		    // pegar uma parte de uma string e armazena em uma variavel char
		    // Assim podemos usar a função isLetter da classe Character
		    // Esta função
		    if (Character.isLetter(caractere)){ // se encontrar uma letra
		        if (!dentroPalavra){    // e não estava dentro da palavra
		            contador++;
                    // sinaliza que passou a ficar dentro da palavra
                    dentroPalavra = true;   
		        }
		    
		     } else { // se não é uma letra
                // sinaliza então que está fora de uma palavra
		         dentroPalavra = false;
		     }
		}
		System.out.println("O texto possui " + contador + " palavras.");
	}
}

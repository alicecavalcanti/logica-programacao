/******************************************************************************
Escreva um programa para informar quantas palavras tem um texto.
Considerar preposição e artigo como palavras.

Exemplo: A rato roeu a roupa do rei de Roma, resulta em 9 palavras

Recomendação: Não utilizar vetor.
Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String texto = "  Analise e     Desenvolvimento de Sistemas";
		int contPalavra = 0;
		
		// Para ignorar os espaços iniciais, avança enquanto tiver espaços
		int i = 0;
		while (texto.substring(i,i+1).equals(" ")) {
		    i++;
		}
		
		// x começa onde i parou no laço acima
		for (int x = i ; x < texto.length(); x++  ){

    		String letra = texto.substring(x,x+1);
    		
    		String proxLetra;
    		if (x<texto.length()-1){
    		    proxLetra = texto.substring(x+1, x+2);
    		}
    		else {  // Não tem mais próxima letra proque chegou no final
    		     proxLetra = "";
    		}

    		if (letra.equals(" ")  && !proxLetra.equals(" ")) { 
    		     contPalavra ++;
    		}

		}
        System.out.println("Quantidade de palavras: " + (contPalavra + 1) );

	}
}

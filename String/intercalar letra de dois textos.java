/******************************************************************************
Escreva um programa intercalar as letras de dois textos e armazená-lo em uma variável . Entre cada letra do novo texto deve haver um espaço.
Exemplo:
COMPUTADOR e NOTEBOOK resulta em C N O O M T P E U B T O A O D K O R

Recomendação: Não usar vetor.
Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String v1 = "computador";
		String v2 = "NOTEBOOK";
		
		String acumulador = "";
		
		
		if (v1.length() < v2.length()){
		   
		for(int i= 0;i<v1.length();i++){
		   
            char letra1 = v1.charAt(i);
            char letra2 = v2.charAt(i);
            acumulador = acumulador + letra1 + letra2 ;
		}  
	    System.out.println(acumulador + v2.substring(v1.length()));
    	} else{
	    	for(int i= 0;i < v2.length();i++){
		   
            char letra1 = v1.charAt(i);
            char letra2 = v2.charAt(i);
            acumulador = acumulador + letra1 + letra2 ;
		}  
		System.out.println(acumulador + v1.substring(v2.length()));
	} 
	
	} 
}



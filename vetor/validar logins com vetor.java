/******************************************************************************

Dado um vetor de string com 5 logins de usuários, elabore um programa para informar se cada um dos logins está “correto” ou “errado”.

Obs.: Para que um login esteja correto todos seus caracteres devem ser letras.

Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String loginsValidos = "";
	    String loginsInvalidos= "";
	    String teste []= {"jul", "gabriltales", "rosianediniz42", "joseronaldo32", "carlosjose58" };
	    
	    for(int x = 0; x < teste.length; x++){
	        
	        for(int i= 0; i < teste[x].length(); i++ ){
	            
    	       if(!(Character.isLetter(teste[x].charAt(i)))){
        		    loginsInvalidos = loginsInvalidos + teste[x] + "\n";
        		    break;
        	    }
        	    
        	    if(i == (teste[x].length()-1)){
                    loginsValidos = loginsValidos + teste[x] + "\n";
                }
	        }
	    }
	    
	    System.out.print("Logins inválidos:\n\n" + loginsInvalidos + "\n\nLogins válidos:\n\n" + loginsValidos);
	 
	}
}
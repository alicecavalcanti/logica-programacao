import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner objeto = new Scanner (System.in);
	   
	    
		System.out.println("Digite quantos votos o candidato1 a ganhou ");
		int candidato1 = objeto.nextInt();
		System.out.println("Digite quantos votos o candidato1 b ganhou ");
		int candidato2 = objeto.nextInt();
		System.out.println("Digite quantos votos o candidato3 c ganhou ");
	    int candidato3 = objeto.nextInt();
	    
	    int totalVotos = candidato1 + candidato2 + candidato3;
	    int metadeVotos = totalVotos/2;
	    
	    
	    if(candidato1 > metadeVotos  || candidato2 > metadeVotos || candidato3 > metadeVotos  ){
	       System.out.println(" não tem segundo turno"); 
	    } else {
	        System.out.println(" tem segundo turno");
	    }
	}
	
}
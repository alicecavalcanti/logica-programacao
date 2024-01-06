/******************************************************************************
   
Escreva um programa para receber a idade de 5 pessoas.
Mostre a média das idades das pessoas da terceira idade.

Obs.: Terceira idade a partir de 60 anos.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int[] idade = new int[5];
	    int contador = 0;
	    double mediaDasIdades = 0;
	    
	    for (int i = 0; i<= 4; i++){
	      System.out.printf("Digite a %dº idades: ", (i+1));
		  idade[i] = scanner.nextInt(); 
		      
		 }
		  for(int i=0; i<=4; i++)
    		  if(idade[i] > 60){
		      mediaDasIdades = idade[i] + mediaDasIdades ;
		      contador++;
	    }  
	     
		 System.out.println(mediaDasIdades/contador);
	}
}


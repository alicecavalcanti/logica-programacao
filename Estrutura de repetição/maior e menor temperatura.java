/******************************************************************************

Escreva um programa para receber a temperatura média em cada dia de uma semana.

No final mostrar:- a maior temperatura
- a menor temperatura


Obs.:
* Todas as temperaturas pode ser negativas* Todas as temperaturas podem ser positivas
* Todas as temperaturas podem ser iguais

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int contador = 0;
		int temperaturaMaior = 0;
		int temperaturaMenor= 0;
		System.out.println(" Digite a temperatura média de cada dia da semana: " );
		do{
		    
		    contador ++;
		    System.out.printf("%dº dia: ", contador );
		    int temperaturaMedia = scanner.nextInt();
		    
		    if (contador == 1){
		        temperaturaMaior = temperaturaMedia;
		        temperaturaMenor = temperaturaMedia;
		        
		     }else {
    		    if(temperaturaMaior > temperaturaMedia){
    		        temperaturaMaior = temperaturaMaior;
    		    } 
    		    else {
    		        temperaturaMaior = temperaturaMedia;
    		    }
    		    
    		   if(temperaturaMenor < temperaturaMedia ){
    		        temperaturaMenor = temperaturaMenor;
    		    }else {
    		        temperaturaMenor = temperaturaMedia;
    		    }    
		    }     
		    
		}while (contador < 7);
		
		System.out.print(" A menor temperatura é " + temperaturaMenor + " e a maior temperatura é " 
		+ temperaturaMaior );
	}
}



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int contador = 0, diasPresenciais = 0, diasOnline = 0;
	    char dias;
	    
		System.out.println("Digite (P para presencial ou O para online) das aulas dos 5 dias úteis de uma semana");
	
		do{
	        contador++;
		    do{
		        System.out.printf("\n %dº dia: ", contador) ;
	            dias = scanner.nextLine().charAt(0);
		        dias = Character.toUpperCase(dias); 
		        
		        if(dias != 'P' && dias != 'O' ){
		            System.out.println("Erro. Digite P para presencial ou O para online");
		        }
		        
		    } while( dias != 'P' && dias != 'O');
		    
		    if (dias == 'P'){
		      diasPresenciais = diasPresenciais + 1;  
		    }
		    else{
		        diasOnline = diasOnline + 1;
		    }
		  
		  
		} while (contador < 5);
		
		 int totalDiasPresenciais = diasPresenciais *3;
		 
		 double totalDiasOnline = diasOnline * 1.5;
		 
		 double cargaHorariaTotal = totalDiasPresenciais + totalDiasOnline;
		     
		 System.out.print("A carga horária total semanal é " + cargaHorariaTotal  +
    		 " horas. Sendo, " + totalDiasPresenciais + " de carga horária semanal de aulas presenciais e " 
    		 + totalDiasOnline + " de carga horária semanal de aulas online" );
		 
		
		
	}
}

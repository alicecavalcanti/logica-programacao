/******************************************************************************

Escreva um programa para receber uma placa de um veículo em qualquer formato 
e mostrar o mês de pagamento do IPVA - Imposto sobre Propriedade de Veículo Automotores.

Tabela de Pagamento:
Final 1-3: Janeiro
Final 4-6: Fevereiro
Final 7-9 e 0: Março
Recomendação: Não usar vetor.
Obs.: Não será aceito link para arquivo compartilhado, arquivo compactado nem imagem.



*******************************************************************************/
import java.util.Scanner;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner (System.in);
	   
	   System.out.println("Digite a placa do veículo"); 
	   String placa = scanner.nextLine();
	   int quantitadeCaracter = placa.length() -1;
	   char janeiro1= '1', janeiro2= '2', janeiro3= '3', fevereiro1 ='4', fevereiro2= '5', fevereiro3 ='6';
	   
	   char numeroPlaca = placa.charAt(quantitadeCaracter);
	   System.out.println(janeiro3);
	   
	   if(numeroPlaca == janeiro1 || numeroPlaca == janeiro2 || numeroPlaca == janeiro3){
	         System.out.println("o mês de pagamento é janeiro");
	   }else if (numeroPlaca == fevereiro1 || numeroPlaca == fevereiro2 || numeroPlaca ==fevereiro3 ){
	        System.out.println("o mês de pagamento é Fevereiro");
	   }
		else{
		    System.out.println("o mês de pagamento é março");
		}
	}
}


/******************************************************************************

A escola de natação Nado a Jato precisa alterar o seu sistema de
cobrança para calcular o valor dos juros de parcela em atraso. O valor
dos juros é cobrado por cada dia de atraso.

Elabore um programa para receber os dados necessários, calcular e mostrar o valor total dos juros
e o valor total do pagamento.

Aluna: ALICE PEREIRA
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    String nomeAluno;
	    
	    int diasAtraso;
	    
	    double jurosCobrado, 
	    totalJuros, 
	    mensalidadeEscola, 
	    totalMensalidade;
	    
	    Scanner objeto = new Scanner(System.in);
	    
	   
	    System.out.print("---------- A escola de natação Nado a Jato ---------- " +
	    "\n Digite o nome do aluno(a): ");
	    nomeAluno = objeto.nextLine();
	    
		System.out.print("\n Digite os dias que o aluno atrasou para pagar a mensalidade: ");
		diasAtraso = objeto.nextInt();
		
		System.out.print("\n Digite o valor dos juros cobrado por cada dia de atraso: R$ ");
		jurosCobrado = objeto.nextDouble();
		
		System.out.print(" \n Digite o valor da mensalidade sem juros da escola Nado a Jato: R$ ");
		mensalidadeEscola = objeto.nextDouble();
		
		totalJuros = jurosCobrado * diasAtraso;
		
		totalMensalidade = totalJuros + mensalidadeEscola;
		
		System.out.printf("\n %s atrasou %d dias e, portanto, ficou com um juros no valor de %.2f reais.\n Sua mensalidade ficou no valor de %.2f reais  ",
		nomeAluno, diasAtraso,totalJuros, totalMensalidade);
	}
}
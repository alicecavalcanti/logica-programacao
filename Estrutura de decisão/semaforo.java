/******************************************************************************
Escreva um programa para ler a velocidade de um veículo e mostrar:
“Verde”, se a velocidade estiver até antes de 5% abaixo do limite permitido.  
“Amarelo”, se a velocidade estiver de 5% abaixo a 5% acima do limite permitido.
“Vermelho”, se a velocidade estiver após 5% acima do limite permitido.

Velocidade permitida: 100 Km/h

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.println("Digite a velocidade ");
		int velocidadeVeiculo = scanner.nextInt();
		int VelocidadeAbaixoLimite = 100 - (100 * 5/100);
		int VelocidadeAcimaLimite = 100 + (100 * 5/100);
	
		if(velocidadeVeiculo < VelocidadeAbaixoLimite ){
		    System.out.print("Verde");
		    
		}else if (velocidadeVeiculo >= VelocidadeAbaixoLimite && velocidadeVeiculo <= VelocidadeAcimaLimite  ){
		    System.out.print("Amarelo");
		    
		}else{
		    System.out.print("Vermelho");
		}
	}
}


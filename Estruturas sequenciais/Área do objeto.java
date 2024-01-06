/******************************************************************************

A área do objeto abaixo pode ser determinada pela metade da área
de um círculo mais da área de um quadrado. Escreva um programa o
para receber o lado do quadrado e mostrar a área do objeto.

Área do círculo = 3.14 * raio * raio
Área do quadrado = lado * lado

Aluna: ALICE PEREIRA
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    double ladoQuadrado, 
	    raioCirculo, 
	    areaQuadrado,
	    metadeAreaCirculo, 
	    areaObjeto;
	    
	    final double PI = 3.14;
	    
	    Scanner objeto = new Scanner(System.in);
	    try{
		    System.out.print("Escreva o lado do quadro: ");
		    ladoQuadrado = objeto.nextInt(); 
		
		    raioCirculo= ladoQuadrado / 2;
		 
		    areaQuadrado = ladoQuadrado * ladoQuadrado;
		 
		    metadeAreaCirculo = (PI * raioCirculo *raioCirculo)/2;
		 
		    areaObjeto = metadeAreaCirculo + areaQuadrado;
	   
		    System.out.printf("Para lado do círculo igual a %.3f, a área desse objeto fica igual a %.3f",
		    ladoQuadrado  ,areaObjeto );
          }
	    catch(Exception e){
		     System.out.print(" O sistema só permite um valor em número ");
		}
		finally{
		     System.out.print("\n fim do sistema");
		}
   }
}
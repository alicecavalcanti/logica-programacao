import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor para o lado do quadrado: ");
	    int	ladoQuadrado = scanner.nextInt();
		
	    final double RAIZQUADRADA2 = Math.sqrt(2);
	    
		double diagonalQuadrado = ladoQuadrado * RAIZQUADRADA2;
		
		System.out.print(diagonalQuadrado);
	}
}


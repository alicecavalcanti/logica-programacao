public class Main
{
	public static void main(String[] args) {
	    
	    int baseRetangulo = 4;
	    int alturaRetangulo = 2;
	    
	    final int QUADRADO = 2;
	    
	    final double BASE_RETANGULO2 = Math.pow(baseRetangulo, QUADRADO);
	    
	    final double ALTURA_RETANGULO2 = Math.pow(alturaRetangulo, QUADRADO);
	    
	     double diagonalRetangulo = Math.sqrt(BASE_RETANGULO2 + ALTURA_RETANGULO2 );
	    
	    System.out.print("A diagonal do retângulo é " + diagonalRetangulo);
	   
	    
	}
}



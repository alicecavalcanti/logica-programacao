/******************************************************************************
Escreva um algoritmo e depois o converta para um programa na linguagem Java que a partir da quantidade comercializada de um produto e de seu preço de venda, mostre o valor total do item.

Exemplo:
Quantidade vendida do produto: 8
Preço de venda: R$ 15,00
Total do item: 8 x 15 => 120


Aluna : Alice Pereira
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int quatidadeVendaProduto, precoVenda;
	    double totalItem;
	    
	    Scanner objeto = new Scanner(System.in);
	    
	    System.out.print("Digite a quantidade de venda do produto: ");
	    quatidadeVendaProduto = objeto.nextInt();
	    
	    System.out.print("Digite o preço do produto: ");
	    precoVenda = objeto.nextInt();
	    
	    
	    totalItem= quatidadeVendaProduto * precoVenda;
	    
		System.out.println("O total da compra é " + totalItem);
	}
}
/******************************************************************************
Escreva um programa para receber 6 números inteiros através de uma estrutura de repetição.
Mostrar, conforme o caso:
Foram informados mais números ímpares
Foram informados mais números pares
Foram informados quantidade iguais de números ímpares e pares

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        
        Scanner scanner = new Scanner(System.in);
        int contador =1;
        int contadorImpar= 0;
        int contadorPar= 0;
        
        do{
            System.out.print("Escreva um número: ");
            int numero = scanner.nextInt();
            
            int restoDivisaoPor2 = numero%2;
            
            if(restoDivisaoPor2 != 0){
                contadorImpar = contadorImpar + 1;
            }else{
                contadorPar = contadorPar + 1;
            }
            contador++ ;
        }while(contador <= 6);
        
        if(contadorImpar > contadorPar){
            System.out.print("Foram informados mais números impares");
        }
        else if(contadorPar > contadorImpar){
            System.out.print("Foram informados mais números pares");
        }
        else{
            System.out.print("Foram informados quantidade iguais de números ímpares e pares");
        }
    }
}


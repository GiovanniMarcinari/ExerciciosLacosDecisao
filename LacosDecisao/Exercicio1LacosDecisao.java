package LacosDecisao;

import java.util.Scanner;

public class Exercicio1LacosDecisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("\nEntre com um n�mero: ");
		a = ler.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a>b && a>c) {
			System.out.println("\nO maior n�mero � " + a);
						
		}
		else if (b>a && b>c) {
			System.out.println("\nO maior n�mero � " + b);
		}
		else {
			System.out.println("\nO maior n�mero � " + c);
		}
			
	}
}
		

	
	

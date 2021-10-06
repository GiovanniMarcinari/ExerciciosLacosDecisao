package LacosDecisao;

import java.util.Scanner;

public class Exercicio1LacosDecisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("\nEntre com um número: ");
		a = ler.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		b = ler.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		c = ler.nextInt();
		
		if (a>b && a>c) {
			System.out.println("\nO maior número é " + a);
						
		}
		else if (b>a && b>c) {
			System.out.println("\nO maior número é " + b);
		}
		else {
			System.out.println("\nO maior número é " + c);
		}
			
	}
}
		

	
	

package LacosDecisao;

import java.util.Scanner;

public class Exercicio3LacosDecisao {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		float n1;
		
		System.out.println("\nEntre com um número: ");
		n1 = ler.nextInt();
		
		if (n1 % 2 == 0) {
			
			System.out.println("\n Número par. A raiz quadrada é: " + Math.sqrt(n1));
		}
		
		
		
		
		else
			System.out.println("\n Número ímpar. Elevado ao quadrado é: " + n1 * n1);

	}

}

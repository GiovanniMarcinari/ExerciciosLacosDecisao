package LacosDecisao;

import java.util.Scanner;

public class Exercicio3LacosDecisao {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		float n1;
		
		System.out.println("\nEntre com um n�mero: ");
		n1 = ler.nextInt();
		
		if (n1 % 2 == 0) {
			
			System.out.println("\n N�mero par. A raiz quadrada �: " + Math.sqrt(n1));
		}
		
		
		
		
		else
			System.out.println("\n N�mero �mpar. Elevado ao quadrado �: " + n1 * n1);

	}

}

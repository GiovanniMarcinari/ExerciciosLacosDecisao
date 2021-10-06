package LacosDecisao;

import java.util.Scanner;

public class Exercicio2LacosDecisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3, maior, menor;

		System.out.println("\nEntre com um número: ");
		n1 = ler.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n3 > n1) {
		    if (n1 > n2)
		    	System.out.println("A ordem crescente: " + n2 + " " + n1 + " " + n3);
		    else if (n2 < n3)		    	
		    	System.out.println("A ordem crescente: " + n1 + " " + n2 + " " + n3);
		}
		  if (n1 > n2) {
		    if (n2 > n3)
		    	System.out.println("A ordem crescente: " + n3 + " " + n2 + " " + n1);
		    else if (n3 < n1)
		    	System.out.println("A ordem crescente: " + n2 + " " + n3 + " " + n1);
		  }
		  if (n1 < n2) {
		    if (n3 < n1)
		    	System.out.println("A ordem crescente: " + n3 + " " + n1 + " " + n2);
		    else if (n3 < n2)
		    	System.out.println("A ordem crescente: " + n1 + " " + n3 + " "+ n2);
		  }
		  

	}

}

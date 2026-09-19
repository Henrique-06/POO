package questao2e3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		CDF cdf=new CDF(); 
		System.out.println("insira numero: ");
		
		int numero=leitor.nextInt();
		
		if (cdf.ePrimo(numero)==true)
			System.out.println("numero é primo");
		else if (cdf.ePrimo(numero)==false)
		System.out.println("numero não é primo");
		leitor.close();
		}
}

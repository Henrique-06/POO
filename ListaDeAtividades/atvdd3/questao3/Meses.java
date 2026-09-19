package questao3;

import java.util.Scanner;

public class Meses {
	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		System.out.println("digite um mês: ");
		String mes=leitor.nextLine();
	
	switch(mes) {
		case "janeiro":
		case "marco":
		case "maio":
		case "julho":
		case "agosto":
		case "outubro":
		case "dezembro":
			System.out.println(mes + " tem 31 dias");
			break;
		case "abril":
		case "junho":
		case "setembro":
		case "novembro":
			System.out.println(mes + " tem 30 dias");
				break;
		case "fevereiro":
			System.out.println(mes + " tem 28 dias");
	}
	leitor.close();
	}
}

package questao2;

import java.util.Scanner;

public class Comparar {
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);

		Nomes nome1= new Nomes();
		Nomes nome2= new Nomes();

		
		System.out.println("digite um nome: ");
		nome1.setNome(leitor.nextLine());
		
		System.out.println("digite outro nome: ");
		nome2.setNome(leitor.nextLine());
	
		System.out.println(nome1.getNome().equals(nome2.getNome())? "São iguais":"Não são iguais");

		leitor.close();
	}
}

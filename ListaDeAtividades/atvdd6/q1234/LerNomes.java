package q1234;

import java.util.Scanner;

public class LerNomes {
	public static void main(String[]args) {
Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite nome: ");
		String nome1=leitor.nextLine();
		String nome2;
do {		
		System.out.println("digite outro nome: ");
		nome2=leitor.nextLine();
}while(nome1.equals(nome2));
	
int r= nome1.compareTo(nome2);
if (r<0)
	System.out.println(nome1 + ", " + nome2);
else
	System.out.println(nome2 + ", " + nome1);
leitor.close();
}}


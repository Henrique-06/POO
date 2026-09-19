package q1234;

import java.util.Scanner;

public class ConversorHDB {
	public static void main(String[]args) {
Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite n decimal: ");
		String texto= leitor.nextLine();
		int decimal= Integer.parseInt(texto,16);
		System.out.println(decimal);
	
		leitor.close();
	}
}

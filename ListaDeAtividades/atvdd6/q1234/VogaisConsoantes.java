package q1234;

import java.util.Scanner;

public class VogaisConsoantes {
	public static void main(String[]args) {

	Scanner leitor=new Scanner(System.in);
	
	System.out.println("escreva: ");
	String texto= leitor.nextLine();
	texto=texto.toLowerCase();
	
	String vogais="aeiou";
	int contVogais=0;
	int contConsoantes=0;
	
	for (int cont=0; cont<texto.length();cont++) {
		char caractere= texto.charAt(cont);
		
		if (Character.isLetter(caractere)) { 
		if (vogais.indexOf(caractere)!=-1) 
			contVogais++;
		else
			contConsoantes++;
	}}
    System.out.println("Vogais: " + contVogais);
    System.out.println("Consoantes: " + contConsoantes);
    leitor.close();
	}}

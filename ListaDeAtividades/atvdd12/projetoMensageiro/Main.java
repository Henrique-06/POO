package projetoMensageiro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
        System.out.print("Digite a mensagem: ");
        String texto = leitor.nextLine();
 
        String destino;
        do {
            System.out.print("Digite o destino (interno ou externo): ");
            destino = leitor.nextLine().trim().toLowerCase();
        } while (!destino.equals("interno") && !destino.equals("externo"));
 
        Mensageiro mensageiro = new Mensageiro();
        Mensagem mensagem = mensageiro.prepararMensagem(texto, destino);
 
        System.out.println();
        System.out.println("Mensagem preparada (" + destino + "):");
        System.out.println(mensagem.getTexto());
 
        leitor.close();
		
	}
}

package ferramenta;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner= new Scanner(System.in );
		Ferramentas ferramentas=new Ferramentas();
		Object[] array=null;
		
		while(array==null) {
			System.out.println("tamanho do array: ");
			String entrada= scanner.nextLine().trim();
			try {
				int tamanho= Integer.parseInt(entrada);
				array=ferramentas.criarArray(tamanho);
			} catch (NumberFormatException e) {
				System.out.println("Erro: | " + entrada + " | Não é um número inteiro válido");
			} catch (MemoriaInsuficienteException|TamanhoNegativoException|
					TamanhoZeroException|TamanhoExcessivoException e) {
				System.out.println("Erro: | "+entrada+" | "+ e.getMessage());
			}
		}
		System.out.println("Array criado com sucesso");
		scanner.close();
	}																		

}


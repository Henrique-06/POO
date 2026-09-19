package projeto_banco;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		Banco banco= new Banco();
		int opcao;
		
		do {
		System.out.println("1 – cadastrar uma conta");
		System.out.println("2 – consultar o saldo de uma conta");
		System.out.println(" 3 – sair.");
		 opcao=leitor.nextInt();
		leitor.nextLine();
		
		switch (opcao) {
		case 1:{
			ContaCorrente c1=new ContaCorrente();
			
			System.out.println("nome do titular: ");
			c1.setTitular(leitor.nextLine());
			
			System.out.println("número do titular: ");
			c1.setNumero(leitor.nextLine());
			
			System.out.println("Saldo incial: ");
			c1.setSaldo(leitor.nextFloat());

			boolean sucesso = banco.salvarConta(c1);
			if(sucesso) {
			System.out.println("Operação bem sucedida");
			break;
			}
			else{
			System.out.println("algo deu errado, banco cheio ou o número já existe ");
			break;
			}
		}
		case 2:{
			System.out.println("insira numero da conta: ");
			String numero=leitor.nextLine();
			ContaCorrente conta= banco.recuperarConta(numero);
			System.out.println("o Saldo é: "+conta.getSaldo());
			
			break;
		}
		case 3:{
			System.out.println("encerrando...");
			break;
		}
		default:{
			System.out.println("tente de novo");
		
			break;
		} }
		}while(opcao!=3);
	
	leitor.close();
		}
}

package projeto_banco;
public class Banco {
	ContaCorrente[] contasSalvas=new ContaCorrente[10];
	int qtd_contas=0;
	
	public boolean salvarConta(ContaCorrente conta) {
	if (qtd_contas>=contasSalvas.length) {
		return false;
	}
		for (int cont=0;cont <qtd_contas;cont++) {
			if (contasSalvas[cont].eIgual(conta)) {
				return false;
			}
		}
		contasSalvas[qtd_contas]=conta;
		qtd_contas++;
		return true;
	}
	public ContaCorrente recuperarConta(String numero) {
		
		for(int cont=0;cont<qtd_contas;cont++) {
			
			if(contasSalvas[cont].getNumero().equals(numero)) {
				return contasSalvas[cont];
			}
		}			return null;
	}
}
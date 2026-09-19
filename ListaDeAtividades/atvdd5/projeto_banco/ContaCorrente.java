package projeto_banco;
public class ContaCorrente {
	private float saldo;
	private String titular;
	private String numero;
	public float getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public String getNumero() {
		return numero;
	}
	public void setSaldo(float s) {
		saldo= s;
	}
	public void setTitular(String t) {
		titular=t;
	}
	public void setNumero(String n) {
		numero=n;
	}
	public boolean eIgual(ContaCorrente conta) {
		if(numero.equals(conta.getNumero())) {
			return true;
			}
			else if (numero.equals(conta.getNumero())==false) {
				return false;
			}
		return false;
	}}
	
	
	
	
	


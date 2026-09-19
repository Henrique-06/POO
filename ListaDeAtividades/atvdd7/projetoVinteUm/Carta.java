package projetoVinteUm;

public class Carta {
	private String naipe;
	private String numeracao;
	private int valor;
	
	public String getNaipe() {
		return naipe;
	}
	
	public String getNumeracao() {
		return numeracao;
	}
	public int getValor() {
		return valor;
	}
	
	public void setNaipe(String naipe) {
		this.naipe=naipe;
	}
	
	public void setNumeracao(String num) {
		numeracao=num;
	}
	
	public void setValor(int valor) {
		this.valor=valor;
	}
	
	public Carta(String naipe,String numeracao,int valor) {
	}
	
	public String toString() {
		return "naipe: "+naipe+", numeração: "+numeracao;
	}
	
}

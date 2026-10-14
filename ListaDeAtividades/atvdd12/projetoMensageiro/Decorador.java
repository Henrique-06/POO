package projetoMensageiro;

public abstract class Decorador extends Mensagem{
	private Mensagem mensagem;

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	
	public Decorador(Mensagem mensagem) {
		this.mensagem=mensagem;
	}
	
	public void setTexto(String texto) {
		mensagem.setTexto(texto);
	}
	public String getTexto() {
		return mensagem.getTexto();
	}
}

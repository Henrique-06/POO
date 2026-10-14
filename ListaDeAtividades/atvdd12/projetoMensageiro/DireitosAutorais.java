package projetoMensageiro;

public class DireitosAutorais extends Decorador{

	public DireitosAutorais(Mensagem mensagem) {
		super(mensagem);
	}

	public String getTexto() {
		return super.getTexto().concat("... [Direitos Reservados].");
	}
}

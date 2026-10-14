package projetoMensageiro;

public class Criptografia extends Decorador{

	public Criptografia(Mensagem mensagem) {
		super(mensagem);
		
	}

	public String getTexto() {
		return super.getTexto().replace(" ", "*");
	}


	
}

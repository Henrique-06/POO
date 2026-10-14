package projetoMensageiro;

public class Mensageiro {
	
	public Mensagem prepararMensagem(String texto, String destino) {
		Mensagem mensagem= new Mensagem();
		mensagem.setTexto(texto);
		
		if("externo".equalsIgnoreCase(destino)) {
			mensagem= new Criptografia(mensagem);
			mensagem= new DireitosAutorais(mensagem);
		}
		return mensagem;
	}
}

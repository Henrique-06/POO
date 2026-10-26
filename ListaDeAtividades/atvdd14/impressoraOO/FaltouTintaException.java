package impressoraOO;

public class FaltouTintaException extends Exception{

	public FaltouTintaException() {
		super("Erro: Toner com tinta insuficiente, troque o Toner e tente outra vez.");
	}

}

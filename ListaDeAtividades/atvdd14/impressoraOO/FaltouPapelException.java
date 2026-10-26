package impressoraOO;


public class FaltouPapelException extends Exception{
	private int papelRestante;

	
	public FaltouPapelException(int papeis) {
			super("Erro: Papel insuficiente, faltam " + papeis + " papeis para finalizar as impressões.");
			this.papelRestante=papeis;
	}
	public int getPapelRestante() {
		return papelRestante;
	}
}

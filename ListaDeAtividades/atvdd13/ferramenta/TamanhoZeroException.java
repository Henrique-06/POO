package ferramenta;

public class TamanhoZeroException extends Exception{
	  public TamanhoZeroException() {
	        super("O tamanho deve ser no mínimo 1; array tamanho 0 não tem serventia.");
	    }
}

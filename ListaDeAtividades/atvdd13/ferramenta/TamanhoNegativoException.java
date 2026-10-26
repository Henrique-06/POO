package ferramenta;

public class TamanhoNegativoException extends Exception{
    public TamanhoNegativoException() {
        super("O tamanho não pode ser negativo.");
    }
}

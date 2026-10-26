package ferramenta;

public class TamanhoExcessivoException extends Exception{
    public TamanhoExcessivoException(int maximo) {
        super("O tamanho ultrapassa o máximo permitido pela JVM: "+maximo);
    }
}

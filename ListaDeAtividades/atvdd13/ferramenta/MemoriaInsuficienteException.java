package ferramenta;

public class MemoriaInsuficienteException extends Exception{
    public MemoriaInsuficienteException() {
        super("Não há memória disponível para criar um array dessa proporção.");
    }
}


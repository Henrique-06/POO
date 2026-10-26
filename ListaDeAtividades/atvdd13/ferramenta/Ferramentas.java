package ferramenta;

public class Ferramentas {
	private int valorMax = Integer.MAX_VALUE -8;

	public Object[] criarArray(int tamanho) throws Exception{
		if (tamanho<0) {
			throw new TamanhoNegativoException();
		} else if(tamanho==0){
			throw new TamanhoZeroException();
		} else if(tamanho>=valorMax) {
			throw new TamanhoExcessivoException(valorMax);
		} 
	       try {
	            return new Object[tamanho];
	        } catch (OutOfMemoryError e) {
	            throw new MemoriaInsuficienteException();
	        }
	}
}

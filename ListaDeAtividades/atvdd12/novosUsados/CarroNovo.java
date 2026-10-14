package novosUsados;

public class CarroNovo extends Carro{
	private float percentualDeAcrescimo;
	
	public CarroNovo(String modelo,float preco) {
		super(modelo,preco);
		percentualDeAcrescimo= 1.1f;
	}

	public float getPercentualDeAcrescimo() {
		return percentualDeAcrescimo;
	}

	
	
	public float getPreco() {
		float fipe = super.getPreco();
		return fipe * percentualDeAcrescimo;
	}
	public String toString() {
		return "Carro novo, "+ super.getModelo()+", R$"+super.getPreco();
	}

}

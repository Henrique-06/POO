package questao45678;

public class Retangulo {
	private int base;
	private int altura;
	
	public int getBase(){
		return base;
	}
	
	public void setbase(int b) {
		base=b;
	}
	
	public int getAltura(){
		return altura;
	}
	
	public void setAltura(int a) {
		altura=a;
	}
	
	public int perimetro() {
		return (altura*2 + base*2);
	}
	
	public int area() {
		return base*altura;
	}
	
	public boolean isQuadrado() {
		if(base==altura) {
			return true;
		}
		else;
		return false;
	}
	
	public boolean eIgual(Retangulo retangulo) {
		if (base ==retangulo.getBase() && altura== retangulo.getAltura()) {
			return true;
		}
		else if (base ==retangulo.getAltura() && altura== retangulo.getBase()) {
			return true;
		}
		return false;
	}

	public void autodesenhar() {
		for (int i =0; i<altura;i++) {
			for (int v =0; v<base;v++) {
				System.out.print("O");
			}
		System.out.println();	
		}
	}
	
	
	
	
}

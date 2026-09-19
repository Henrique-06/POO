package questao45678;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		Retangulo r1=new Retangulo();
		Retangulo r2=new Retangulo();

		System.out.println("Qual a medida da base do 1º: ");
		r1.setbase(leitor.nextInt());
		System.out.println("Qual a medida da altura do 1º: ");
		r1.setAltura(leitor.nextInt());
		System.out.println("Qual a medida da base do 2º: ");
		r2.setbase(leitor.nextInt());
		System.out.println("Qual a medida da altura do 2º: ");
		r2.setAltura(leitor.nextInt());
		
		
		if(r1.isQuadrado()==true) 
			System.out.println("O primeiro retângulo é um quadrado");
		else if(r1.isQuadrado()==false)
		System.out.println("O primeiro retângulo não é um quadrado");
		
		if(r2.isQuadrado()==true) 
			System.out.println("O segundo retângulo é um quadrado");
		else if (r2.isQuadrado()==false)
		System.out.println("O segundo retângulo não é um quadrado");

		
		if (r1.eIgual(r2)==true)
			System.out.println("Eles são iguais.");
		else if (r1.eIgual(r2)==false)
		System.out.println("Eles não são iguais.");
		
		if(r1.area()>r2.area()) {
			System.out.println("Retângulo #1");
			r1.autodesenhar();
			}
		else if(r1.area()==r2.area()) {
			System.out.println("áreas iguais");

			r1.autodesenhar();
		}
		else;{
			System.out.println("Retângulo #2");
			r2.autodesenhar();
			}
	leitor.close();	
	}

}

package q1234;
import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[]args) {
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite n números(separe por vírgulas): ");
		String texto= leitor.nextLine();
		String[] numeros= texto.split(",");
		
		int maior=Integer.parseInt(numeros[0]);
		int menor=Integer.parseInt(numeros[0]);
		
		for (String num:numeros) {
			int n =Integer.parseInt(num);
			maior=Math.max(maior, n);
			menor=Math.min(menor, n);
		}
        System.out.println("O maior número lido foi: " + maior);
        System.out.println("O menor número lido foi: " + menor);
        leitor.close();
	}
}

package questao1;
import java.util.Scanner;
public class CalculandoMedias {
	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		int []arrayDeMedias= new int[5];

		System.out.println("Digite as 5 médias:");
		for(int cont =0;cont<arrayDeMedias.length;cont++) {
			arrayDeMedias[cont]= leitor.nextInt();
		
		}
		
		int abaixoDaMedia=0;
		for(int cont =0;cont<arrayDeMedias.length;cont++) {
			if (arrayDeMedias[cont]<7) {
				abaixoDaMedia++;
			}		
		}
		System.out.println(abaixoDaMedia+" alunos estão abaixo da média");
		leitor.close();
	}

}

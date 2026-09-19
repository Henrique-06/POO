package questao4e5;
import java.util.Scanner;


public class Programa {
public static void main(String[] args) {
	Scanner leitor=new Scanner(System.in);
	Paciente p1=new Paciente();
	Nutricionista nutri=new Nutricionista();
	
	System.out.println("digite peso paciente: ");
	p1.setPeso(leitor.nextFloat());
	
	System.out.println("digite altura paciente(metros): ");
	p1.setAltura(leitor.nextFloat());

	System.out.println("faixa do paciente: "+ nutri.avaliarIMC(p1));
	leitor.close();
}
}

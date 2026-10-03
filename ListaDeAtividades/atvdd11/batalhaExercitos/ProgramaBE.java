import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ProgramaBE{
public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    Jogador jogador1;
    Jogador jogador2;
    
    System.out.println("Batalha de Exercitos");
    
    System.out.println("Nome do Jogador 1: ");
    String nome1 = leitor.nextLine();
    jogador1 = new Jogador(nome1);
        
    System.out.println("Digite a quantidade de Cavalaria que deseja comprar(custo ->100): ");
    int qtdCavalaria = Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador1, new Cavalaria(), qtdCavalaria);
    
    System.out.println("Digite a quantidade de Infantaria que deseja comprar(custo ->100): ");
    int qtdInfantaria =Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador1, new Infantaria(), qtdInfantaria);
    
    System.out.println("Digite a quantidade de Catapulta que deseja comprar(custo ->100): ");
    int qtdCatapulta = Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador1, new Catapulta(), qtdCatapulta);
    
    System.out.println("Nome do Jogador 2: ");
    String nome2 = leitor.nextLine();
    jogador2 = new Jogador(nome2);

    System.out.println("Digite a quantidade de Cavalaria que deseja comprar(custo ->100): ");
    int qtdCavalaria = Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador2, new Cavalaria(), qtdCavalaria);
    
    System.out.println("Digite a quantidade de Infantaria que deseja comprar(custo ->100): ");
    int qtdInfantaria =Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador2, new Infantaria(), qtdInfantaria);
    
    System.out.println("Digite a quantidade de Catapulta que deseja comprar(custo ->100): ");
    int qtdCatapulta = Integer.parseInt(leitor.nextLine());
    AdiconarExercito.adicionarExercito(jogador2, new Catapulta(), qtdCatapulta);

    int pontosJogador1 = 0;
    int pontosJogador2 = 0;
    ArrayList<Arma> Exercito1 = jogador1.getArmas();
    Collections.shuffle(Exercito1);
    ArrayList<Arma> Exercito2 = jogador2.getArmas();
    Collections.shuffle(Exercito2);
    for (int i = 0; i < jogador1.getArmas().size();i++){
        if (Exercito1.get(i).getClass().equals(Exercito2.get(i).getClass())){
            System.out.println("Empate");
            Exercito1.remove(i);
            Exercito2.remove(i);
        } else if (Exercito1.get(i).ganhaQuandoAtacadoPor(Exercito2.get(i))) {
        pontosJogador1++;
        Exercito2.remove(i);
      }
        else {
            pontosJogador2++;
            Exercito1.remove(i);
        }
    }
    System.out.println("Pontos do Jogador 1: " + pontosJogador1);
    System.out.println("Pontos do Jogador 2: " + pontosJogador2);
    if (pontosJogador1 > pontosJogador2){
        System.out.println(jogador1.getNome() + " venceu!!");
    } else if (pontosJogador2 > pontosJogador1){
        System.out.println(jogador2.getNome() + " venceu!!");
    } else {
        System.out.println("Empate");
    }
}
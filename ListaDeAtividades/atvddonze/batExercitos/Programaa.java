package batExercitos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programaa {
	public static void main(String[] args){
	    Scanner leitor = new Scanner(System.in);
	    Jogador jogador1;
	    Jogador jogador2;
	    
	    System.out.println("Batalha de Exercitos");
	    
	    System.out.println("Nome do Jogador 1: ");
	    String nome1 = leitor.nextLine();
	    jogador1 = new Jogador(nome1);
	       System.out.println("você tem: " + jogador1.getDinheiro());
	    System.out.println("Digite a quantidade de Cavalaria que deseja comprar(custo ->100): ");
	    int qtdCavalaria1 = Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador1, new Cavalaria(), qtdCavalaria1);
	       System.out.println("você tem: " + jogador1.getDinheiro());

	    System.out.println("Digite a quantidade de Infantaria que deseja comprar(custo ->100): ");
	    int qtdInfantaria1 =Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador1, new Infantaria(), qtdInfantaria1);
	       System.out.println("você tem: " + jogador1.getDinheiro());

	    System.out.println("Digite a quantidade de Catapulta que deseja comprar(custo ->100): ");
	    int qtdCatapulta1 = Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador1, new Catapulta(), qtdCatapulta1);
	    
	    System.out.println("Nome do Jogador 2: ");
	    String nome2 = leitor.nextLine();
	    jogador2 = new Jogador(nome2);
	       System.out.println("você tem: " + jogador2.getDinheiro());

	    System.out.println("Digite a quantidade de Cavalaria que deseja comprar(custo ->100): ");
	    int qtdCavalaria2 = Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador2, new Cavalaria(), qtdCavalaria2);
	       System.out.println("você tem: " + jogador2.getDinheiro());

	    System.out.println("Digite a quantidade de Infantaria que deseja comprar(custo ->100): ");
	    int qtdInfantaria2 =Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador2, new Infantaria(), qtdInfantaria2);
	       System.out.println("você tem: " + jogador2.getDinheiro());

	    System.out.println("Digite a quantidade de Catapulta que deseja comprar(custo ->100): ");
	    int qtdCatapulta2 = Integer.parseInt(leitor.nextLine());
	    AdiconarExercito.adicionarExercito(jogador2, new Catapulta(), qtdCatapulta2);

	    
	    ArrayList<Arma> Exercito1 = jogador1.getArmas();
	    
	    ArrayList<Arma> Exercito2 = jogador2.getArmas();
	    
	    
	    while (!Exercito1.isEmpty() && !Exercito2.isEmpty()) {
	    	Collections.shuffle(Exercito1);
	    	Collections.shuffle(Exercito2);
	        if (Exercito1.get(0).getClass().equals(Exercito2.get(0).getClass())){
	            Exercito1.remove(0);
	            Exercito2.remove(0);
	        } else if (Exercito1.get(0).ganhaQuandoAtacadoPor(Exercito2.get(0))) {
	        Exercito2.remove(0);
	      }
	        else {
	            Exercito1.remove(0);
	        }
	    }

	    if (Exercito1.isEmpty()){
	        System.out.println(jogador2.getNome() + " venceu!!");
	    } else if (Exercito2.isEmpty()){
	        System.out.println(jogador1.getNome() + " venceu!!");
	    } else {
	        System.out.println("Empate");
	    }
	    leitor.close();}
}

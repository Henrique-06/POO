package batExercitos;

public class AdiconarExercito{
    public static void adicionarExercito(Jogador jogador, Arma arma, int custo){
        if (jogador.getDinheiro() < custo*arma.getCusto()){
            System.out.println("Dinheiro insuficiente para comprar a arma.");
            return;
        }
        for (int i = 0; i < custo; i++){
            jogador.getArmas().add(arma);
        }
        jogador.setDinheiro(jogador.getDinheiro() - custo*arma.getCusto());
    }

}
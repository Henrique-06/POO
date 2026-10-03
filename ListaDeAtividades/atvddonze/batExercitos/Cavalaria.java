package batExercitos;

public class Cavalaria extends Arma{
    private int custo = 100;
    public int getCusto(){
        return this.custo;
    }
    public boolean ganhaQuandoAtacadoPor(Arma atacante){
        return atacante instanceof Catapulta;
    }
}
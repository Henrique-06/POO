package batExercitos;

public abstract class Arma{
    public abstract boolean ganhaQuandoAtacadoPor(Arma atacante);

	protected abstract int getCusto();
}
package impressoraOO;

public class Impressora {
    private int qtdPapeis;
    private float cargaToner;
    private int totalImpresso;

    public Impressora() {
        this.qtdPapeis = 0;
        this.cargaToner = 100;
        this.totalImpresso = 0;
    }

    public int imprimir(int paginas) throws FaltouPapelException, FaltouTintaException {
        float gastoToner = 0.35f;
        int impressas = 0;

        while (impressas < paginas) {
            if (qtdPapeis <= 0) {
                throw new FaltouPapelException(paginas - impressas);
            }
            if (cargaToner < gastoToner) {
                throw new FaltouTintaException();
            }
            qtdPapeis--;
            cargaToner -= gastoToner;
            impressas++;
            totalImpresso++;
        }
        return impressas;
    }

    public void carregarPapeis(int papeis) { qtdPapeis += papeis; }
    public void recarregarToner() { cargaToner = 100; }
    public int getQtdPapeis() { return qtdPapeis; }
    public float getCargaToner() { return cargaToner; }
    public int getTotalImpresso() { return totalImpresso; }
}

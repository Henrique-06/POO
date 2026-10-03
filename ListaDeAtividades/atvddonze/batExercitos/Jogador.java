package batExercitos;

import java.util.ArrayList;

public class Jogador{
    private String nome;
    private ArrayList<Arma> armas;
    private int dinheiro;
    
    public Jogador(String nome){
        this.nome = nome;
        this.armas = new ArrayList<Arma>();
        this.dinheiro = 1200;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getDinheiro(){
        return this.dinheiro;
    }
    
    public ArrayList<Arma> getArmas(){
        return this.armas;
    }
    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }
}
package q5;

public class Jogador {
private String nome;
private int pontos=0;

public Jogador(String n) {
	nome=n;
}

public String getNome() {
	return nome;
}

public int getPontos() {
	return pontos;
}

public void addPonto() {
	pontos++;
}



}

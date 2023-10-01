package br.edu.ifg;

public class Jogador extends Pessoa {
    private boolean titular;

    public Jogador(String nome, String cpf, String sexo, boolean titular){
        super(nome, cpf, sexo);
        this.titular = titular;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}

package br.edu.ifg;

public class Rodada {
    private int numRodada;
    private Jogo[] jogos;
    
    public Rodada(int numRodada, Jogo[] jogos) {
        this.numRodada = numRodada;
        this.jogos = jogos;
    }

    public void realizarJogos(){
        System.out.println("Número da rodada: "+ getNumRodada());
        for(int i=0; i<jogos.length;i++){
            jogos[i].atribuirResultado();
            jogos[i].exibirInformacoes();
        }
    }
    public int getNumRodada() {
        return numRodada;
    }

    public void setNumRodada(int numRodada) {
        this.numRodada = numRodada;
    }

    public Jogo[] getJogos() {
        return jogos;
    }

    public void setJogos(Jogo[] jogos) {
        this.jogos = jogos;
    }

    
}

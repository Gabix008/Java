package br.edu.ifg;
import java.util.Scanner;

public class Equipe {
    private Scanner ent = new Scanner (System.in);
    private String nomeTime;
    private int pontuacao;
    private Jogador[] jogadores;
    private Tecnico tecnico;

    public Equipe(String nomeTime) {
        this.nomeTime = nomeTime;
        this.criarJogadores();
        this.criarTecnico();
        this.pontuacao = 0;
    }

    public void criarJogadores() {
        Jogador[] jogadores= new Jogador[22];
        int titulares = 0;

       for(int i = 0; i< 22; i++){
        String nome, cpf, sexo, opcao;
        boolean titular = false;
        System.out.println("Digite o nome do jogador: ");
        nome = ent.nextLine();
        System.out.println("Digite o CPF: ");
        cpf= ent.nextLine();
        System.out.println("Digite o sexo M/F: ");
        sexo = ent.nextLine();
        if(titulares < 11){
            System.out.println("É titular s/n: ");
            opcao = ent.nextLine();
            if(opcao.equals("s")){
                titular=true;
                titulares++;
            }
        }

        jogadores[i]=new Jogador(nome, cpf, sexo, titular);
       } 
       setJogadores(jogadores);
    }
    public void criarTecnico(){
        Tecnico tecnico;
        String nome, cpf, sexo, funcao;

        System.out.println("Digite o nome do técnico: ");
        nome = ent.nextLine();
        System.out.println("Digite o CPF: ");
        cpf= ent.nextLine();
        System.out.println("Digite o sexo M/F: ");
        sexo = ent.nextLine();
        System.out.println("Digite a funçao: ");
        funcao = ent.nextLine();
        tecnico = new Tecnico(nome, cpf, sexo, funcao);
        setTecnico(tecnico);
    } 

    public void exibirInformacoes(){
        System.out.println("Tecnico: " + this.getTecnico().getNome());
        System.out.println("Jogadores titulares: ");
        for(int i=0; i<22; i++){
            if(jogadores[i].isTitular()){
                System.out.println((i+1)+ " - " + jogadores[i].getNome());
            }

        }

        System.out.println("Jogadores reservas: ");
        for(int i=0; i<22; i++){
            if(!jogadores[i].isTitular()){
                System.out.println((i+1)+ " - " + jogadores[i].getNome());
            }
        }
   
    }

    public String getNomeTime() {
        return nomeTime;
    }
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    

    
}

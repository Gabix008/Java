package br.edu.ifg;

import java.util.Objects;
import java.util.Scanner;

public class Campeonato {
    private Scanner ent = new Scanner (System.in);
    private String nomeCampeonato;
    private Equipe[] equipes;
    private int numRodadas;
    private Rodada[] rodadas;
    private String divisao;

    public Campeonato(String nomeCampeonato, Equipe[] equipes, String divisao) {
        this.nomeCampeonato = nomeCampeonato;
        this.equipes = equipes;
        this.numRodadas = this.definirNumRodadas();
        this.criarRodadas();
        this.divisao = divisao;
    }

    public void realizarCampeonato(){
        for(int i=0; i<rodadas.length;i++){
            rodadas[i].realizarJogos();
        }
    }

     public void criarRodadas(){
        Rodada [] rodadas = new Rodada[getNumRodadas()];
        
        for(int i=0; i<getNumRodadas();i++){
            Jogo[] jogos = new Jogo[getEquipes().length/2]; 
            System.out.println("Informaçoes da rodada " + (i+1));
            for(int j=0; j < jogos.length;j++){
                String data;
                String local;
                String horario;
                Equipe equipevisitante;
                Equipe equipevisitada;

                System.out.println("Digite a data do jogo: ");
                data = ent.nextLine();
                System.out.println("Digite o horario: ");
                horario = ent.nextLine();
                System.out.println("Digite o local:");
                local = ent.nextLine();
                System.out.println("Qual o nome da equipe visitante: ");
                for(int z=0; z<equipes.length;z++){
                    System.out.println((z+1)+"-"+equipes[z].getNomeTime());
                }
                int opcaoEquipeVisitante=ent.nextInt();
                clearBuffer(ent);
                equipevisitante = equipes[opcaoEquipeVisitante-1];
                
                System.out.println("Digite o nome da equipe visitada: ");
                for(int z=0; z<equipes.length;z++){
                    System.out.println((z+1)+"-"+equipes[z].getNomeTime());
                }
                int opcaoEquipeVisitada=ent.nextInt();
                clearBuffer(ent);
                equipevisitada = equipes[opcaoEquipeVisitada-1];
                jogos[j] = new Jogo(data, horario, local, equipevisitante, equipevisitada);
            }
            rodadas[i]=new Rodada(i+1, jogos);
        }       
        setRodadas(rodadas); 
     }
    public void exibirCampeao(){
        Equipe equipeCampea=null;
        for(int i=0;i<equipes.length;i++){
            if(Objects.isNull(equipeCampea)){
                equipeCampea = equipes[i];
            } 
            if(equipeCampea.getPontuacao() < equipes[i].getPontuacao()){
                equipeCampea = equipes[i];
            }
        }
        System.out.println("A equipe campea foi: " + equipeCampea.getNomeTime());
        System.out.println("A pontuacao foi: " + equipeCampea.getPontuacao());
    }
    public int definirNumRodadas(){
        int numTimes = equipes.length;
        int numRodadas = (numTimes - 1) * 2;
        return numRodadas;
    }
    public String getDivisao(){
        return divisao;
    }
    public void setDivisao (String divisao){
        this.divisao = divisao;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }
    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }
    public Equipe[] getEquipes() {
        return equipes;
    }
    public void setEquipes(Equipe[] equipes) {
        this.equipes = equipes;
    }
    public int getNumRodadas() {
        return numRodadas;
    }
    public void setNumRodadas(int numRodadas) {
        this.numRodadas = numRodadas;
    }
    public Rodada[] getRodadas() {
        return rodadas;
    }
    public void setRodadas(Rodada[] rodadas) {
        this.rodadas = rodadas;
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
}

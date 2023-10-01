package br.edu.ifg;
import java.util.Scanner;
public class Jogo {
    private Scanner ent=new Scanner(System.in);
    private String data;
    private String horario;
    private String local;
    private Arbitro arbitro;
    private String resultado;
    private Equipe equipeVisitante;
    private Equipe equipevisitada;
    private Equipe equipevencedora;


    public Jogo(String data, String horario, String local,  Equipe equipeVisitante,
            Equipe equipevisitada) {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.criarArbitro();
        this.equipeVisitante = equipeVisitante;
        this.equipevisitada = equipevisitada;
    }
    public void criarArbitro(){
        String nome, cpf, sexo, funcao, federacao;
        Arbitro arbitro;
        System.out.println("Digite o nome do arbitro: ");
        nome = ent.nextLine();
        System.out.println("Digite o CPF: ");
        cpf= ent.nextLine();
        System.out.println("Digite o sexo M/F: ");
        sexo = ent.nextLine();
        System.out.println("Digite a funçao: ");
        funcao = ent.nextLine();
        System.out.println("Digite a federação: ");
        federacao = ent.nextLine();
        arbitro = new Arbitro(nome, cpf, sexo, funcao, federacao);
        setArbitro(arbitro);
    }
    public void atribuirResultado (){
        String resultado=" ";
        int pontuacao=0;
        System.out.println("Qual foi a equipe vencedora \n1-"+this.getEquipevisitada().getNomeTime()+"\n2-"+this.getEquipeVisitante().getNomeTime()+"\n3- empate:");
        int opcao=ent.nextInt();

        if(opcao==1){
            pontuacao=equipevisitada.getPontuacao();
            setEquipevencedora(equipevisitada);
            equipevisitada.setPontuacao(pontuacao+3);
        } else if(opcao==2){
            pontuacao = equipeVisitante.getPontuacao();
            setEquipevencedora(equipeVisitante);
            equipeVisitante.setPontuacao(pontuacao+3);
        } else{
            pontuacao = equipeVisitante.getPontuacao();
            equipeVisitante.setPontuacao(pontuacao+1);
            pontuacao = equipevisitada.getPontuacao();
            equipevisitada.setPontuacao(pontuacao+1);
            setEquipevencedora(null);
        }

        if(opcao<3){
            int golEquipeVencedora=0;
            int golEquipePerdedora=0;
            System.out.println("Digite a qtd de gols da equipe vencedora: ");
            golEquipeVencedora=ent.nextInt();
            System.out.println("Digite a qntd de gols da equipe perdedora: ");
            golEquipePerdedora=ent.nextInt();
            while(golEquipePerdedora>=golEquipeVencedora){
                System.out.println("Digite a qntd de gols da equipe perdedora: ");
                golEquipePerdedora=ent.nextInt();
            }
            if(opcao==1){
                resultado=equipevisitada.getNomeTime() + " " + golEquipeVencedora + " X " + golEquipePerdedora + " " + equipeVisitante.getNomeTime();
            }
            if(opcao==2){
                resultado=equipevisitada.getNomeTime() + " " + golEquipePerdedora + " X " + golEquipeVencedora + " " + equipeVisitante.getNomeTime();
            }
            setResultado(resultado);
        }
        if(opcao==3){
            int gols=0;
            System.out.println("Digite a quantidade de gols: ");
            gols=ent.nextInt();

            resultado=equipevisitada.getNomeTime() + " " + gols + " X " + gols + " " + equipeVisitante.getNomeTime();
        }
         setResultado(resultado);
         System.out.println(getResultado());
    }

    public void exibirInformacoes(){
        System.out.println("Data do jogo: "+getData());
        System.out.println("Local: "+getLocal());
        System.out.println("Horário: "+getHorario());
        System.out.println("Arbitro: "+getArbitro());
        System.out.println("Equipe visitada: " + getEquipevisitada().getNomeTime());
        getEquipevisitada().exibirInformacoes();
        System.out.println("Equipe visitante: " + getEquipeVisitante().getNomeTime());
        getEquipeVisitante().exibirInformacoes();
        System.out.println(resultado);
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Equipe getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(Equipe equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public Equipe getEquipevisitada() {
        return equipevisitada;
    }

    public void setEquipevisitada(Equipe equipevisitada) {
        this.equipevisitada = equipevisitada;
    }

    public Equipe getEquipevencedora() {
        return equipevencedora;
    }

    public void setEquipevencedora(Equipe equipevencedora) {
        this.equipevencedora = equipevencedora;
    }

    
}

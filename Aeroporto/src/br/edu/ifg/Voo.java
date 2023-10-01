package br.edu.ifg;
import java.util.Scanner;

import br.edu.ifg.interfaces.IVoo;

public class Voo implements IVoo {
    private String ocorrenciaVoo;
    private String data;
    private String horarioSaida;
    private String horarioChegada;
    private Aviao aviao; 
    private Piloto piloto;
    private Copiloto copiloto;
    private Aeromoca aeromoca[];
    private Passageiro passageiro[];
    private Aeroporto aeroportoChegada;
    private Aeroporto aeroportoSaida;
    private String empresa;
    private Scanner ent = new Scanner(System.in);

    public Voo (){
        this.definirEmpresa();
        this.definirOcorrencia();
        this.definirAviao();
        this.definirPiloto();
        this.definirCopiloto();
        this.definirAeromoca();
        this.definirAeroportoSaida();
        this.definirAeroportoChegada();
        this.definirData();
        this.definirHorarioSaida();
        this.definirHorarioChegada();
        this.definirPassageiros();

    }

    public void definirEmpresa(){
        String empresa;
        System.out.println("Digite o nome da empresa responsavel: ");
        empresa=ent.nextLine();
        setEmpresa(empresa);
    }

    public void definirOcorrencia(){
        String ocorrencia;
        System.out.println("Digite a ocorrencia do voo: ");
        ocorrencia=ent.nextLine();
        setOcorrenciaVoo(ocorrencia);
    }

    public void definirAviao() {
        Aviao aviao = new Aviao();
        setAviao(aviao);
    }

    public void definirPiloto(){
        String nome, cpf,sexo, lincenca;
        System.out.println("Digite o nome do piloto: ");
        nome=ent.nextLine();
        System.out.println("Digite o CPF: ");
        cpf=ent.nextLine();
        System.out.println("Digite o sexo: ");
        sexo=ent.nextLine();
        System.out.println("Digite a licenca: ");
        lincenca=ent.nextLine();
        Piloto piloto = new Piloto(nome, cpf, sexo,this.getAviao().getIdentificacao(), lincenca);
        setPiloto(piloto);
    }

    public void definirCopiloto(){
        String nome, cpf,sexo, lincenca;
        System.out.println("Digite o nome do Co-piloto: ");
        nome=ent.nextLine();
        System.out.println("Digite o CPF: ");
        cpf=ent.nextLine();
        System.out.println("Digite o sexo: ");
        sexo=ent.nextLine();
        System.out.println("Digite a licenca: ");
        lincenca=ent.nextLine();
        Copiloto copiloto = new Copiloto(nome, cpf, sexo,this.getAviao().getIdentificacao(),lincenca);
        setCopiloto(copiloto);
    }
   
    public void definirAeromoca(){
        int qtdAeromocas;
        System.out.println("Digite a quantidade de aeromoças: ");
        qtdAeromocas= ent.nextInt();
        this.clearBuffer(ent);
        Aeromoca [] aeromocas = new Aeromoca[qtdAeromocas];

        for(int i=0;i<qtdAeromocas;i++){
            String nome, cpf, sexo;
            System.out.println("Digite o nome da aeromoça: ");
            nome=ent.nextLine();
            System.out.println("Digite o CPF: ");
            cpf=ent.nextLine();
            System.out.println("Digite o sexo: ");
            sexo=ent.nextLine();
            
            aeromocas[i] = new Aeromoca(nome, cpf, sexo, this.getAviao().getIdentificacao(), true);
        }
        setAeromoca(aeromocas);
    }

    public void definirData (){
        String data;
        System.out.println("Digite a data do voo: ");
        data=ent.nextLine();
        setData(data);
    }
    
    public void definirAeroportoSaida(){
        Aeroporto aeroporto;
        aeroporto=new Aeroporto("saida");
        setAeroportoSaida(aeroporto);
    }

    public void definirAeroportoChegada(){
       Aeroporto aeroporto;
        aeroporto=new Aeroporto("chegada");
        setAeroportoChegada(aeroporto);
    }

    public void definirHorarioSaida(){
        String horarioSaida;
        System.out.println("Digite o horário da saida: ");
        horarioSaida = ent.nextLine();
        setHorarioSaida(horarioSaida); 
    }

    public void definirHorarioChegada(){
        String horariochegada;
        System.out.println("Digite o horário da chegada: ");
        horariochegada = ent.nextLine();
        setHorarioChegada(horariochegada); 
    }

    public void definirPassageiros(){
        int qtdPassageiro;
        System.out.println("Digite a quantidade de passageiros: ");
        qtdPassageiro=ent.nextInt();
        this.clearBuffer(ent);

        while(qtdPassageiro>this.getAviao().getQtdLugar()){
            System.out.println("Digite a quantidade de passageiros valida: ");
            qtdPassageiro=ent.nextInt();
            this.clearBuffer(ent);
        }
        Passageiro[] passageiros=new Passageiro[qtdPassageiro];
        for(int i=0; i<qtdPassageiro;i++){
            String nome, cpf, sexo;
            System.out.println("Digite o nome do passageiro: ");
            nome=ent.nextLine();
            System.out.println("Digite o CPF: ");
            cpf=ent.nextLine();
            System.out.println("Digite o sexo: ");
            sexo=ent.nextLine();
            passageiros[i]=new Passageiro(nome, cpf, sexo, this.getAviao().getIdentificacao());  
        }
        this.setPassageiro(passageiros);

        for(int i=0; i<qtdPassageiro;i++){
            this.getPassageiro()[i].definirPoltrona(this.getAviao().getQtdLugar(), this.getPassageiro());
        }
    }

    public void exibirInformacoesVoo(){
        System.out.println("\t\t\t Informacoes do voo:\t\t\t");
        System.out.println("Identificacao: "+this.getAviao().getIdentificacao());
        System.out.println("Quantidade de lugares: "+this.getAviao().getQtdLugar());
        System.out.println("Piloto: "+this.getPiloto().getNome());
        System.out.println("Copiloto: "+this.getCopiloto().getNome());
        System.out.println("Aeromocas: ");
        for(int i =0; i<this.getAeromoca().length;i++){
            System.out.println((i+1)+ " - " + this.getAeromoca()[i].getNome());
        }
        System.out.println("Aeroporto de partida: "+this.getAeroportoSaida().getNomeAeroporto());
        System.out.println("Data: "+this.getData());
        System.out.println("Horario: " + this.getHorarioSaida());
        System.out.println("Aeroporto de chegada: "+this.getAeroportoChegada().getNomeAeroporto());
        System.out.println("Horario: "+this.getHorarioChegada());

        System.out.println("\t\tPassageiros: ");
        for (int i = 0 ; i<this.getPassageiro().length;i++){
            System.out.println("Poltrona: "+this.getPassageiro()[i].getPoltrona() + " Nome: " + this.getPassageiro()[i].getNome());
        }
    }

    public String getOcorrenciaVoo() {
        return ocorrenciaVoo;
    }

    public void setOcorrenciaVoo(String ocorrenciaVoo) {
        this.ocorrenciaVoo = ocorrenciaVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Copiloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Copiloto copiloto) {
        this.copiloto = copiloto;
    }

    public Aeromoca[] getAeromoca() {
        return aeromoca;
    }

    public void setAeromoca(Aeromoca[] aeromoca) {
        this.aeromoca = aeromoca;
    }

    public Passageiro[] getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro[] passageiro) {
        this.passageiro = passageiro;
    }

    public Aeroporto getAeroportoChegada() {
        return aeroportoChegada;
    }

    public void setAeroportoChegada(Aeroporto aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    public Aeroporto getAeroportoSaida() {
        return aeroportoSaida;
    }

    public void setAeroportoSaida(Aeroporto aeroportoSaida) {
        this.aeroportoSaida = aeroportoSaida;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    private void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
     
}

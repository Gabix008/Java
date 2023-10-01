package br.edu.ifg;
import java.util.Scanner;

import br.edu.ifg.interfaces.IAviao;

public class Aviao implements IAviao{
    private int qtdLugar;
    private String identificacao;
    private Scanner ent = new Scanner(System.in);
    public Aviao (){
        this.definirIdentificacao();
        this.definirQtdLugar();
    }

    public void definirQtdLugar(){
        int qtdLugar;
        System.out.println("Digite a quantidade de lugares: ");
        qtdLugar=ent.nextInt();
        setQtdLugar(qtdLugar);
    }
    
    public void definirIdentificacao(){
        String identificacao;
        System.out.println("Digite a identificação do aviao: ");
        identificacao = ent.nextLine();
        setIdentificacao(identificacao);
    }

    public int getQtdLugar() {
        return qtdLugar;
    }

    public void setQtdLugar(int qtdLugar) {
        this.qtdLugar = qtdLugar;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    
}

package br.edu.ifg;

import java.util.Scanner;

public class Aeroporto {
    private String nomeAeroporto; 
    private Scanner ent = new Scanner(System.in);

    public Aeroporto(String status){
        this.definirAeroporto(status);
    }

    public void definirAeroporto(String status){
        String nomeAeroporto;
        System.out.println("Digite o nome do aeroporto de "+status+": ");
        nomeAeroporto = ent.nextLine();
        setNomeAeroporto(nomeAeroporto); 
    }

    public String getNomeAeroporto() {
        return this.nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

}

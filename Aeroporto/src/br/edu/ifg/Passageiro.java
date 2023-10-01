package br.edu.ifg;
import java.util.Random;

import br.edu.ifg.interfaces.IPassageiro;

public class Passageiro extends Pessoa implements IPassageiro {
    private int poltrona;

    public Passageiro(String nome, String cpf, String sexo, String indentificadorDoVoo){
        super(nome, cpf, sexo, indentificadorDoVoo);
    }

    public void definirPoltrona(int qtdLugar, Passageiro []passageiros){
        Random numAleatorio = new Random();
        int numPoltrona = numAleatorio.nextInt(qtdLugar);
        numPoltrona += 1; 
        boolean opcao=true;
        System.out.println(qtdLugar);

        while(opcao){

            for(int i=0; i<passageiros.length;i++){
                if(passageiros[i].getPoltrona()==numPoltrona){
                    opcao=true;
                    numPoltrona=numAleatorio.nextInt(qtdLugar);
                } else{
                    opcao=false;
                }
            }

        }
        
       this.setPoltrona(numPoltrona);
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
}

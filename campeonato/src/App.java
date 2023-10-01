import br.edu.ifg.Campeonato;
import br.edu.ifg.Equipe;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner (System.in);
        int opcao;
        String divisao;
        Campeonato campeonato;
        String nomeCampeonato;
        System.out.println("Digite o nome do campeonato:");
        nomeCampeonato=ent.nextLine();
        System.out.println("Qual é a divisão: \n 1- Primeira divisao\n 2- Segunda divisao\n 3- Campeonatos regionais");
        opcao=ent.nextInt();
        if(opcao==1){
           divisao= "Primeira divisao";
        } else if(opcao==2){
           divisao= "Segunda divisao";
        } else{
           divisao= "Campeonatos regionais";
        }
        Equipe[] equipes=criarEquipes(ent);
        campeonato = new Campeonato(nomeCampeonato, equipes, divisao);
        campeonato.realizarCampeonato();
        campeonato.exibirCampeao();
    }

    public static Equipe[] criarEquipes(Scanner ent){
        int numEquipes;
        System.out.println("Digite a quantidade de equipes: ");
        numEquipes=ent.nextInt();
        clearBuffer(ent);

        while(numEquipes%2!=0){
            System.out.println("Digite a quantidade de equipes: ");
            numEquipes=ent.nextInt();
            clearBuffer(ent);
        }

        Equipe[] equipes = new Equipe[numEquipes];

        for(int i=0;i<numEquipes;i++){
            String nomeTime;
            System.out.println("Digite o nome da equipe " + (i+1) + ":");
            nomeTime=ent.nextLine();
            equipes[i]=new Equipe(nomeTime);
        }
        return equipes;
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    
}

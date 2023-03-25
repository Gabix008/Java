import java.util.Scanner;
public class ListaEx3{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite a idade do pai: ");
        int idadePai= ent.nextInt();
        System.out.println("Digite a idade do filho: ");
        int idadeFilho= ent.nextInt();
        int comp= idadePai-idadeFilho;
        System.out.println("A diferença de idade entre os dois é de "+comp+" anos!");
    }
}

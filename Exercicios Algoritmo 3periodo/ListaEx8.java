import java.util.Scanner;

public class ListaEx8{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite o comprimento da caixa: ");
        float comprimento=ent.nextFloat();
        System.out.println("Digite a largura da caixa: ");
        float largura=ent.nextFloat();
        System.out.println("Digite a altura da caixa: ");
        float altura=ent.nextFloat();
        float volumeAgua= comprimento*altura*largura;
        System.out.println("O volume de água que pode ser armazenado nessa caixa é de: "+volumeAgua+" litros");
    }
}
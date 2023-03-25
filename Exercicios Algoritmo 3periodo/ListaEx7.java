import java.util.Scanner;
public class ListaEx7{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Olá João! Digite a quantidade de money que você possui: ");
        float dolar=ent.nextFloat();
        Float real= dolar*5.25f;
        System.out.println("O seu dinheiro em reais é R$ "+real);
    }
}
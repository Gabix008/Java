import java.util.Scanner;
public class ListaEx4{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade=ent.nextInt();
        int diasVividos;
        diasVividos=idade*365;
        System.out.println(" Você já viveu " +diasVividos+ " dias!");
    }
}


        
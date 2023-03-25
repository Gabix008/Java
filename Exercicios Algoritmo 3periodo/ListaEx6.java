import java.text.DecimalFormat;
import java.util.Scanner;
public class ListaEx6{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite o comprimento do retângulo: ");
        float comprimento = ent.nextFloat();
        System.out.println("Digite a largura do retângulo:");
        float largura=ent.nextFloat();
        float area= comprimento*largura;
        System.out.println("A área desse retângulo é: "+area);
    }
}
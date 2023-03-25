import java.util.Scanner;
public class ListaEx5{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1=ent.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2=ent.nextInt();
        System.out.println("Digite o ultimo número: ");
        int n3=ent.nextInt();
        int media= (n1+n2+n3)/3;
        System.out.println("A média dos números calculados é: "+media);

    }
}
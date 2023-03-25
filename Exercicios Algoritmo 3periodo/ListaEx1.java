import java.util.Scanner;
public class ListaEx1 {
    public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
     int n1,n2;
     int soma;
     System.out.println("Digite o primeiro número: ");
     n1=ent.nextInt();
     System.out.println("Digite o proximo número: ");
     n2=ent.nextInt();
     soma= n1+n2;
     System.out.println("A soma dos dois números é: "+soma);
    }
}
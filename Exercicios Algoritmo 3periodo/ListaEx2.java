import java.util.Scanner;
public class ListaEx2 {
    public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
     int n1,n2,n3;
     int mult;
     System.out.println("Digite o primeiro número: ");
     n1=ent.nextInt();
     System.out.println("Digite o proximo número: ");
     n2=ent.nextInt();
     System.out.println("Digite o proximo número: ");
     n3=ent.nextInt();
     mult= n1*n2*n3;
     System.out.println("A multiplicção dos números é: "+mult);
    }
}
import java.util.Scanner;

public class ListaEx9{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite a sua nota do 1º bimestre: ");
        int nota1=ent.nextInt();
        System.out.println("Digite a sua nota do 2º bimestre: ");
        int nota2=ent.nextInt();
        float mediaSemestre= (nota1*0.4f)+(nota2*0.6f);
        System.out.println("Sua média semestral é: "+ mediaSemestre);
    }
}
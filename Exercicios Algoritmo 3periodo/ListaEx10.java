import java.util.Scanner;
public class ListaEx10{
    public static void main(String args[]){
        Scanner ent=new Scanner(System.in);
        System.out.println("Digite sua temperatura em farenheit: ");
        float F= ent.nextFloat();
        float C= (F-32)* 5/9;
        System.out.println("A mesma temperatura em celsius é "+C+"°C");
    }
}

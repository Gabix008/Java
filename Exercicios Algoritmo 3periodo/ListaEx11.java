import java.util.Scanner;

public class ListaEx11 {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite a tarifa da água: ");
        Float tarifaAgua= ent.nextFloat();
        Float tarifaEsgoto = tarifaAgua * 0.8f;
        Float finalTarifa = tarifaAgua + tarifaEsgoto;
        String result = String.format("%.2f", finalTarifa);
        System.out.println("O valor final a ser pago é R$ "+result);
    }
}

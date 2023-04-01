import java.util.Scanner;

public class ExercicioFarrer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] a = new int [20][50];
        int [][] b = new int [20][50];
        int m, n;

        System.out.println ("Informe a quantidade de linhas desejadas: ");
        m = sc.nextInt();

        System.out.println ("Informe a quantidade de colunas desejadas: ");
        n = sc.nextInt();
        
        System.out.println ("Informe os dados da tabela A (" + m + " x " + n + ")");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.print ("Informe o número da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
            }
        }

        System.out.println ("Tabela B");
        for (int i = 0; i < m; i++){
            System.out.print ("Linha " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print (" " + b[i][j]);
            }
            System.out.println();
        }
        
    }
}

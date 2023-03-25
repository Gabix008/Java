import java.util.Scanner;
public class Matriz {
	public static void main(String[] args){
		 Scanner ent = new Scanner(System.in);
		 int C=0, L=0;
		 int MatrizA [] [];
		 int MatrizB [] [];
		 int MatrizR [] [];
		 System.out.print("Digite o número de linhas: ");
		 L = ent.nextInt();
		 System.out.print("Digite o número de colunas: ");
		 C = ent.nextInt();
		 MatrizA = new int[L][C];
		 MatrizB = new int[C][L];
		 MatrizR = new int[C][L];
		 for(int i =0;i<L;i++) {
			 System.out.println();
			 for(int j=0;j<C;j++) {
				 System.out.println("Digite um numero: ");
				 MatrizA [i][j]=ent.nextInt();
			 }
		 }
		 for(int i =0;i<C;i++) {
			 System.out.println();
			 for(int j=0;j<L;j++) {
				 System.out.println("Digite um numero: ");
				 MatrizB [i][j]=ent.nextInt();
			 }
		 }
		 for (int i=0;i<L;i++) {
			 for(int j=0; j<C;j++) {
				System.out.println(MatrizA[i][j]+ MatrizB[i][j]);
				 
				 
			 }
			 }
		 for (int i=0;i<L;i++) {
			 for(int j=0; j<C;j++) {
				 for(int x=0; x>C;x++) {
					 MatrizR[i][j] = MatrizA[i][x]*MatrizB[x][j];
				 }
			 }
		}
		for(int i=0;i<C;i++){
			 for(int j=0;j<L;j++) {
				System.out.println(MatrizR[i][j]);
			 }
		 }
	 }
}

import java.util.Scanner;
public class Matricula {
    public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
      int calc1[]= new int[7];
      int alg1[]= new int[5];
      int rep[]= new int[5];
      int i,j,k,t;
      System.out.println("Alunos matriculados em calculo 1");
      for (i=0;i<6;i++){
        System.out.print("Digite a identificação do aluno: ");
        calc1[i]=ent.nextInt();
      }
      System.out.println("Alunos matriculados em Algoritmos 1");
      for(j=0;j<4;j++){
        System.out.print("Digite a identificação do aluno: ");
        alg1[j]=ent.nextInt();
      }
      k=0;
      for(i=0;i<6;i++){
        for(j=0;j<4;j++){
            if(calc1[i] == alg1[j]){
                rep[k]=alg1[j];
                k++;
            }
        }
      }
      t=k;
      for(k=0;k<t;k++){
        System.out.println("Tem"+rep[k]+" alunos repetidos");
      }
      }
}

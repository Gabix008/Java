public class exercicioAula1{
    public static void main (String [] args) {
        int [] [] a = new int [2] [4];
        int [] [] b = new int [2] [4];
        int [] [] c = new int [2] [4];
        int i=0;
        int j=0;

        a[i] [j] = 7; 
        a[i] [j] = 8; 
        a[i] [j] = 4; 
        a[i] [j] = 9; 
        a[i] [j] = 2; 
        a[i] [j] = 1; 
        a[i] [j] = 7; 
        a[i] [j] = 3; 

        b[i] [j] = 7; 
        b[i] [j] = 8; 
        b[i] [j] = 4; 
        b[i] [j] = 9; 
        b[i] [j] = 2; 
        b[i] [j] = 1; 
        b[i] [j] = 7; 
        b[i] [j] = 3;

       for(i=0;i<2;i++){
           for(j=0;j<4;j++){
             c[i] [j]=a[i][j]+ b[i][j];
           }
        }
        System.out.println ("Tabela C (A + B)");
        for ( i = 0; i < 2; i++){
            System.out.print ("Linha " + (i + 1) + ": ");
            for (j = 0; j < 4; j++) {
                System.out.print (" " + c[i][j]);
            }
            System.out.println();
        }
    }
    
}
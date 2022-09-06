import java.util.Scanner;
public class Igual{
public static void main(String[] args) {
        final int N = 10;
        Scanner in = new Scanner(System.in);
        int a[], b[], c[], i, j,x, contIguais=0;
        a = new int[N];
        b = new int[N];
        
        for(i=0; i<N; i++) {
            System.out.println("Digite o "+(i+1)+" valor de A");
            a[i] = in.nextInt();
        }
        
        for(i=0; i<N; i++) {
            System.out.println("Digite o "+(i+1)+" valor de B");
            b[i] = in.nextInt();
        }
        
        for(i=0; i<N; i++) {
            for (j=0; j<N; j++) {
                if (a[i] == b[j]) {
                    contIguais++;
                }
            }
        }
        
          System.out.println("A = ");
          for(i=0; i<N; i++) {
              System.out.print(a[i]+" ");
          }
          System.out.println("\n");
        		System.out.print("B = ");
          for(i=0; i<N; i++) {
              System.out.print(b[i]+" ");
          }
           System.out.println("\n");
           System.out.println("C :");
           
        if (contIguais == 0) {
            System.out.println("Não há valores iguais e o vetor C está vazio");
        }else {
            x=0;
            c = new int[contIguais];
            for (i = 0; i<N ; i++) {
                for (j = 0; j<N; j++) {
                    if (a[i] == b[j]) {
                            c[x] = a[i];
                             
                            System.out.print(c[x]+" ");
                            x++;
                 }
             }
          }
        }
    }
}

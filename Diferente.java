import java.util.Scanner;
public class Diferente{
 public static void main(String[] args) {
        final int N = 10;
        Scanner in = new Scanner(System.in);
        int a[], b[], c[], i, j, x, dif;
        a = new int[N];
        b = new int[N];
        c = new int[N];
        
        for(i=0; i<N; i++) {
            System.out.println("Digite o "+(i+1)+" valor de A");
            a[i] = in.nextInt();
        }
        for(i=0; i<N; i++) {
            System.out.println("Digite o "+(i+1)+" valor de B");
            b[i] = in.nextInt();
        }
         x = 0;
        for (i=0; i<N; i++) {
          dif = 0;
        for (j=0; j<N; j++) {
          if (a[i] == b[j])
          dif = 1;
    }
    if (dif == 0) {
       c[x] = a[i];
       x = x + 1;
    }else {
      System.out.println("Todos os valores são iguais e o vetor C esta vazio:");
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
   System.out.println("C = ");
  for (i=0; i<N; i++) {
    if (i < x){
    System.out.print(c[i]+"");
   
      }
    }  
  }
}
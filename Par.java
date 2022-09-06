import java.util.Scanner;
public class Par{
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 final int NUM = 20; 
 int a[], b[], i, par=0, impar=0;
 
 a = new int[NUM];
 b = new int[NUM];

 for(i =0; i<NUM; i++) { 
 System.out.println("Entrar com o "+(i+1)+ " valor:");
 a[i] = in.nextInt();
 if (a[i]%2 == 0) {
 par++;
 }else {
 impar++;
 }
}

int numPar = 0;
int numImpar = par; 

 for(i =0; i<NUM; i++) { 
 if(a[i]%2 == 0){
     b[numPar] = a[i];
     numPar++;
 }else{
     b[numImpar] = a[i];
     numImpar++;
 }
}

  System.out.print("A = ");
  for(i =0; i<NUM; i++) { 
  System.out.print(a[i]+" ");
 }
  System.out.println("\n");
  System.out.print("B = ");
		
		for(i=0;i<NUM;i++) {
			System.out.print(b[i]+" ");
		}

  System.out.println("\nPares: "+par);
  System.out.println("Impares: "+impar);
  
 }
}

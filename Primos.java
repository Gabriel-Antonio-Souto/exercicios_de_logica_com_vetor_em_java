import java.util.Scanner; 
public class Primos {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in); 
    final int TAM=10 ; 
    int a[], i, R0=0, j; 

    a = new int[TAM]; 

    for(i =0; i<TAM; i++) { 
    System.out.println("Leia o "+(i+1)+ " valor:"); 
    a[i] = in.nextInt();

    for(j=1; j<=a[i]; j++){
        if (a[i]%j == 0) {
            R0++;
    }
    }
    if(a[i] == 1){
        System.out.println("O número "+a[i]+" não é primo");
    }else if(R0<=2){
        System.out.println("O número "+a[i]+" é primo");
    }else{
        System.out.println("O número "+a[i]+" não é primo");
    }
    R0 = 0;
    }

    System.out.println("A = ");
    for(i =0; i<TAM; i++) { 
    System.out.print(a[i]+""); 

        }

    } 

}
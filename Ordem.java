import java.util.Scanner;
public class Ordem{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	final int NUM=10;
	int a[], b[] ;
	int aux = 0;
	int i = 0,  t=0;

    a = new int[NUM];
    b = new int[NUM];
 
	for(i = 0; i<NUM; i++){
	    System.out.println("Digite "+(t=t+1)+"º valor de a:");
			a[i] = in.nextInt();
			b[i] = a[i];
	}
	System.out.println(" ");

	for(i = 0; i<NUM; i++){
		for(int j = 0; j<9; j++){
			if(b[j] > b[j + 1]){
				aux = b[j];
				b[j] = b[j+1];
				b[j+1] = aux;
			}
		}
	}
	
	System.out.println("Vetor desordenado: ");
	System.out.println("A :");
	
		for(i = 0; i<NUM; i++){
		System.out.print(" "+a[i]);
	}
	
	System.out.println("\n");
	System.out.println("Vetor organizado:");
	System.out.println("B :");
	for(i = 0; i<NUM; i++){
		System.out.print(" "+b[i]);
	}
  }
}

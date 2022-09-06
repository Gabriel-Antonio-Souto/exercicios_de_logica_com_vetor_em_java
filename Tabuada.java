import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=6;
		
		int i=0, a[], r, j, t=0;
		
		a = new int[NUM];
		
		for(j=0; j<=4; j++) { 
			System.out.println("Digite "+(t=t+1)+"º valor de a para ve a sua tabuada: ");
			a[j] = in.nextInt();
			
				for(i=0; i<=10; i++){
				r = a[j]*i;
				System.out.println(a[j]+"x"+i+" = "+r);
    }
}
		System.out.println("\n");
			System.out.print("A = ");
		for(i=0;i<5;i++) {
			System.out.print((a[i])+" ");
		}
		
	
	}
}

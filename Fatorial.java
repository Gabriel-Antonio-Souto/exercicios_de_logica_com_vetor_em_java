import java.util.Scanner;
public class Fatorial{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=15;
		int j;
		int i, a[], b[];
		int fat = 1;
		
		a = new int[NUM];
		b = new int[NUM];
		
		for(i=0; i<NUM; i++) { 
			System.out.println("Digite o "+(i+1)+"º valor de a:");
			a[i] = in.nextInt();
			
			for(j=a[i]; j>=1; j++){
		    fat = fat*j;
			for(i=0; i<NUM; i++) {
			    
			 if (a[i] == 1){
		       fat = 1*1;
		   }
		   if (a[i] == 2){
		       fat = 2*(2-1);
		   }
		   if(a[i] == 3){
		       fat = 3*(3-1); 
			}
			b[i] = fat;
			}
			
		}
		
		System.out.print("A = ");
		for(i=0;i<15;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		System.out.print("B = ");
		
		for(i=0;i<15;i++) {
			System.out.print(b[i]+" ");
		}

	}
  }
}


import java.lang.Math;
import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=11;
		int i, a[];
		double pot;
		
		a = new int[NUM];
		
	for(i=0; i<NUM; i++) { 
			
		pot = Math.pow(2, i);
          System.out.println(pot);
			
			a[i] = 2;
	}
	
		in.close();
	}

 }


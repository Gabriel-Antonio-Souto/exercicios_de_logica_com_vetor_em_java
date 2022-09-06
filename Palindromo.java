import java.util.Scanner;
public class Palindromo{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	  final int NUM = 10;
	  int i, j, a[];
	  boolean numero;
	   
      a = new int[NUM];
     
		for (i=0; i<NUM; i++) {
		System.out.println("Digite o valor:");
		a[i] = in.nextInt();
	}
	  i = 0; 
	  j = (NUM-1);
      numero = true; 
      if (a[i] != a[j]){
           numero = false;
       } else {
          j = j - 1;
          i = i + 1;
        }
        if (numero == true){
         System.out.println("O vetor é um palindromo:");
      }  else {
        System.out.println("O vetor não é um palindromo:");
     }
      
      for(i=0; i<NUM; i++){
          
       System.out.print(a[i]+"");
      }
      in.close();
   }
}


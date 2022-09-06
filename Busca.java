import java.util.Scanner;
public class Busca {
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 final int NUM = 11; 
 int a[], i=0, n;
 int achou=0;
 
 a = new int[NUM];
 for(i =0; i<10; i++) { 
 System.out.println("Entrar com o "+(i+1)+ " valor:");
 a[i] = in.nextInt();
}

System.out.println("Digite um número para encontrar:");
n = in.nextInt();

i=0;
achou=0;
    if (n == a[i]){
    achou = 1;
    }else{
    i = i - 1;
    }

 if (achou == n){
     System.out.println("Encontrado");
 }else {
      System.out.println("Não encontrado");
 }

 }
}

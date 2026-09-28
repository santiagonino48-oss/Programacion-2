import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fibo = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");

        int n = scanner.nextInt();
        if ((n==0)||(n==1))
          fibo=0;
        else{
          int fib1=0;
          int fib2=1;
          for(int i =1;i<n;i++){
            fibo=fib1+fib2;
            fib1=fib2;
            fib2=fibo;
          }
        }
            System.out.print("Fibonacci de " + n + " es: " + fibo);
    }

}
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n para calcular o n-ésimo número da sequência Fibonacci:");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        if (n == 0) {
            System.out.println("O número pertence à sequência de Fibonacci.");

        }
            while (b < n) {
                int soma = a + b;
                a = b;
                b = soma;
            }
            
            
            if (n == b) {
                System.out.println("O número pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número não pertence à sequência de Fibonacci.");
            }
        

        scanner.close();
    }
}

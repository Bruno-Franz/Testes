import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra:");

        String palavra = scanner.nextLine();

        System.out.println("Número de letras: " + palavra.length());

        System.out.print("Nome ao contrário: ");
    
    for (int cont = palavra.length() -1; cont >= 0; cont--)
    {
      System.out.print(palavra.charAt(cont));
    }

    scanner.close();
    
}
}

public class Soma {
    public static void main(String[] args) throws Exception {
        

        /*int INDICE = 13, SOMA = 0, K = 0;   
        enquanto K < INDICE faça   
        {   K = K + 1;   SOMA = SOMA + K;   }   imprimir(SOMA);  */

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {

            k = k + 1;

            soma = soma + k;
        }

        System.out.println(" O resultado da soma é: " + soma);
    }
}

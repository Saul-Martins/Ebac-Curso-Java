import java.util.Arrays;

public class FatorialDinamicoTopDown {
    private static long[] memo;

    public static long calcularFatorial(int numero) {
        memo = new long[numero + 1];
        Arrays.fill(memo, -1); // Inicializa o vetor de memoização com -1 (valor inválido)

        return calcularFatorialMemo(numero);
    }

    private static long calcularFatorialMemo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }

        if (memo[numero] != -1) {
            return memo[numero];
        }

        memo[numero] = numero * calcularFatorialMemo(numero - 1);
        return memo[numero];
    }

    public static void main(String[] args) {
        int numero = 7;
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

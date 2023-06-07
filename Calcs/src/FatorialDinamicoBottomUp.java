public class FatorialDinamicoBottomUp {
    public static long calcularFatorial(int numero) {
        long[] memo = new long[numero + 1];
        memo[0] = 1; // Caso base: fatorial de 0 é 1

        for (int i = 1; i <= numero; i++) {
            memo[i] = i * memo[i - 1];
        }

        return memo[numero];
    }

    public static void main(String[] args) {
        int numero = 7;
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

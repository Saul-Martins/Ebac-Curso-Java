public class Fibonacci {
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static int fibonacciDinamicoBottomUp(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }

    public static int fibonacciDinamicoTopDown(int n) {
        int[] memo = new int[n + 1];
        return fibonacciDinamicoTopDownHelper(n, memo);
    }

    private static int fibonacciDinamicoTopDownHelper(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacciDinamicoTopDownHelper(n - 1, memo) + fibonacciDinamicoTopDownHelper(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Série de Fibonacci (Recursivo):");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }

        System.out.println("\nSérie de Fibonacci (Dinâmico - Bottom-up):");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciDinamicoBottomUp(i) + " ");
        }

        System.out.println("\nSérie de Fibonacci (Dinâmico - Top-down com Memoização):");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciDinamicoTopDown(i) + " ");
        }
    }
}

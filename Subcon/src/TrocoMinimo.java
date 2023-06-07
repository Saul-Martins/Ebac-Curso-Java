import java.util.Arrays;

public class TrocoMinimo {

    public static int calcularTrocoMinimo(int quantia, int[] moedas) {
        int[] dp = new int[quantia + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= quantia; i++) {
            for (int j = 0; j < moedas.length; j++) {
                if (moedas[j] <= i && dp[i - moedas[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - moedas[j]]);
                }
            }
        }

        return dp[quantia];
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};

        int trocoMinimo = calcularTrocoMinimo(quantia, moedas);

        System.out.println("Troco mínimo: " + trocoMinimo);
    }
}

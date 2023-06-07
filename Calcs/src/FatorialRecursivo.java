public class FatorialRecursivo {
    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 7;
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

}

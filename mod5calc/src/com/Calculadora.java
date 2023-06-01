package com;

public class Calculadora {

    // Método para adicionar dois números inteiros
    public static int adicionar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números inteiros
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números inteiros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números inteiros
    public static int dividir(int a, int b) {
        if (b == 0) { // Verifica se o divisor é zero
            throw new ArithmeticException("Divisão por zero não é permitida."); // Lança uma exceção caso o divisor seja zero
        }
        return a / b; // Realiza a divisão
    }

    // Método main usado para testar a calculadora
    public static void main(String[] args) {
        int resultadoAdicao = adicionar(3, 4); // Chama o método adicionar e armazena o resultado
        System.out.println("Resultado da adição: " + resultadoAdicao); // Imprime o resultado da adição

        int resultadoSubtracao = subtrair(7, 2); // Chama o método subtrair e armazena o resultado
        System.out.println("Resultado da subtração: " + resultadoSubtracao); // Imprime o resultado da subtração

        int resultadoMultiplicacao = multiplicar(5, 6); // Chama o método multiplicar e armazena o resultado
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao); // Imprime o resultado da multiplicação

        try {
            int resultadoDivisao = dividir(10, 2); // Chama o método dividir e armazena o resultado
            System.out.println("Resultado da divisão: " + resultadoDivisao); // Imprime o resultado da divisão
        } catch (ArithmeticException e) { // Captura uma exceção caso ocorra uma divisão por zero
            System.out.println("Erro: " + e.getMessage()); // Imprime a mensagem de erro
        }

        try {
            int resultadoDivisaoPorZero = dividir(5, 0); // Chama o método dividir com um divisor zero, gerando uma exceção
            System.out.println("Resultado da divisão: " + resultadoDivisaoPorZero);
        } catch (ArithmeticException e) { // Captura a exceção gerada pela divisão por zero
            System.out.println("Erro: " + e.getMessage()); // Imprime a mensagem de erro
        }
    }
}

package Test.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        Fibonacci fibonacci = new Fibonacci();  // Cria uma instância da classe Fibonacci
        int resultado = fibonacci.calculaFibonacci(0);  // Chama o método calculaFibonacci() passando o valor 0
        Assertions.assertEquals(0, resultado);  // Verifica se o resultado é igual a 0 usando o método assertEquals() do JUnit
    }

    @Test
    public void testFibonacciUm() {
        Fibonacci fibonacci = new Fibonacci();  // Cria uma instância da classe Fibonacci
        int resultado = fibonacci.calculaFibonacci(1);  // Chama o método calculaFibonacci() passando o valor 1
        Assertions.assertEquals(1, resultado);  // Verifica se o resultado é igual a 1 usando o método assertEquals() do JUnit
    }

    @Test
    public void testFibonacciCinco() {
        Fibonacci fibonacci = new Fibonacci();  // Cria uma instância da classe Fibonacci
        int resultado = fibonacci.calculaFibonacci(5);  // Chama o método calculaFibonacci() passando o valor 5
        Assertions.assertEquals(5, resultado);  // Verifica se o resultado é igual a 5 usando o método assertEquals() do JUnit
    }

    @Test
    public void testFibonacciDez() {
        Fibonacci fibonacci = new Fibonacci();  // Cria uma instância da classe Fibonacci
        int resultado = fibonacci.calculaFibonacci(10);  // Chama o método calculaFibonacci() passando o valor 10
        Assertions.assertEquals(55, resultado);  // Verifica se o resultado é igual a 55 usando o método assertEquals() do JUnit
    }

    @Test
    public void testFibonacciVinte() {
        Fibonacci fibonacci = new Fibonacci();  // Cria uma instância da classe Fibonacci
        int resultado = fibonacci.calculaFibonacci(20);  // Chama o método calculaFibonacci() passando o valor 20
        Assertions.assertEquals(6765, resultado);  // Verifica se o resultado é igual a 6765 usando o método assertEquals() do JUnit
    }
}

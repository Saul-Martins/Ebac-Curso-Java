package Test.com;

import com.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Teste para o método adicionar da Calculadora
    @Test
    public void testAdicionar() {
        int resultado = Calculadora.adicionar(3, 4); // Chama o método adicionar da Calculadora com os argumentos 3 e 4
        Assertions.assertEquals(7, resultado); // Verifica se o resultado é igual a 7 usando o método assertEquals do JUnit
    }

    // Teste para o método subtrair da Calculadora
    @Test
    public void testSubtrair() {
        int resultado = Calculadora.subtrair(7, 2); // Chama o método subtrair da Calculadora com os argumentos 7 e 2
        Assertions.assertEquals(5, resultado); // Verifica se o resultado é igual a 5 usando o método assertEquals do JUnit
    }

    // Teste para o método multiplicar da Calculadora
    @Test
    public void testMultiplicar() {
        int resultado = Calculadora.multiplicar(5, 6); // Chama o método multiplicar da Calculadora com os argumentos 5 e 6
        Assertions.assertEquals(30, resultado); // Verifica se o resultado é igual a 30 usando o método assertEquals do JUnit
    }

    // Teste para o método dividir da Calculadora
    @Test
    public void testDividir() {
        int resultado = Calculadora.dividir(10, 2); // Chama o método dividir da Calculadora com os argumentos 10 e 2
        Assertions.assertEquals(5, resultado); // Verifica se o resultado é igual a 5 usando o método assertEquals do JUnit
    }

    // Teste para verificar se a divisão por zero gera uma exceção
    @Test
    public void testDividirPorZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(5, 0); // Chama o método dividir da Calculadora com divisor zero, esperando uma exceção
        });
    }
}

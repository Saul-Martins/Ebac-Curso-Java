import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Pessoas.Homem;
import Pessoas.Mulher;
import Pessoas.Pessoas;

public class AppTest {

    @Test
    public void testListarMulheres() {
        List<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(new Homem("Omega", "M", 16));
        pessoas.add(new Mulher("Julia", "F", 16));
        pessoas.add(new Homem("Miguel", "M", 17));
        pessoas.add(new Homem("Carlos", "M", 18));
        pessoas.add(new Mulher("Leticia", "F", 19));
        pessoas.add(new Mulher("Shakira", "F", 20));

        List<Pessoas> mulheres = new ArrayList<>();
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getSexo().equals("F")) {
                mulheres.add(pessoa);
            }
        }

        assertEquals(3, mulheres.size());
    }
}

import Pessoas.Homem;
import Pessoas.Mulher;
import Pessoas.Pessoas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Pessoas> pessoas = new ArrayList<>();

        pessoas.add(new Homem("Omega", "M", 16));
        pessoas.add(new Mulher("Julia", "F", 16));
        pessoas.add(new Homem("Miguel", "M", 17));
        pessoas.add(new Homem("Carlos", "M", 18));
        pessoas.add(new Mulher("Leticia", "F", 19));
        pessoas.add(new Mulher("Shakira", "F", 20));

        System.out.println("Pessoas: ");
        pessoas.forEach(p -> System.out.println("Nome: " + p.getNome() + " || Sexo: " + p.getSexo() + " || Idade: " + p.getIdade()));

        System.out.println("\n\nMulheres: ");
        pessoas.stream().filter(p -> p.getSexo().equals("F")).forEach(p -> System.out.println("Nome: " + p.getNome() + " || Sexo: " + p.getSexo() + " || Idade: " + p.getIdade()));
    }
}

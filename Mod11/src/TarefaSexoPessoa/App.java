package TarefaSexoPessoa;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        List<Sexo> sexoPessoa = new ArrayList<>();

        sexoPessoa.add(new Sexo("Cleber", "M"));
        sexoPessoa.add(new Sexo("Pricila", "F"));
        sexoPessoa.add(new Sexo("Rosana", "F"));
        sexoPessoa.add(new Sexo("Joao", "M"));
        sexoPessoa.add(new Sexo("Marcia", "F"));

        List<Sexo> homens = new ArrayList<>();
        List<Sexo> mulheres = new ArrayList<>();

        for (Sexo pessoa : sexoPessoa) {
            if (pessoa.getSexo().equals("M")) {
                homens.add(pessoa);
            } else if (pessoa.getSexo().equals("F")) {
                mulheres.add(pessoa);
            }
        }

        System.out.println("Homens:");
        for (Sexo homem : homens) {
            System.out.println(homem.getNome() + " - M");
        }

        System.out.println("\nMulheres:");
        for (Sexo mulher : mulheres) {
            System.out.println(mulher.getNome() + " - F");
        }
    }
}

package TarefaPessoaAlfabeticaOrdem;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        List<Pessoa> nome = new ArrayList<>();

        nome.add(new Pessoa ("Cleber"));
        nome.add(new Pessoa ("Pricila"));
        nome.add(new Pessoa ("Rosana"));
        nome.add(new Pessoa ("Joao"));
        nome.add(new Pessoa ("Marcia"));

        Collections.sort(nome);

        for(Pessoa nomePessoa : nome){
            System.out.println(nomePessoa.getNome());
        }
    }
}

import pessoas.Pessoa;
import pessoas.pessoaFisica;
import pessoas.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {

    public static void main(String[] args){
        List<Pessoa> pessoas = criarPessoas();
        acao1(pessoas);
    }

    public static void acao1(List<Pessoa> pessoas){
        Scanner scan = new Scanner(System.in);
        System.out.println("Você quer consultar que tipo de pessoa?:\n1)Pessoa física\n2)Pessoa jurídica");
        System.out.println("Digite 1 ou 2: ");
        int opcao1 = scan.nextInt();

        if(opcao1 == 1){
            acao2fisica(pessoas);
        }else if(opcao1 == 2){
            acao2juridica(pessoas);
        }else{
            System.out.println("Opção inválida.");
        }
    }
    public static void acao2juridica(List<Pessoa> pessoas){
        for(int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof pessoaJuridica) { // verifica se é uma pessoa jurídica
                pessoaJuridica pessoaJuridica = (pessoaJuridica) pessoas.get(i); // faz o cast para pessoaJuridica
                System.out.println(pessoaJuridica.getNome() + " " + pessoaJuridica.getSobrenome() + " - " + pessoaJuridica.getDocumento());
            }
        }
    }
    public static void acao2fisica(List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof pessoaFisica) {
                pessoaFisica pessoaFisica = (pessoaFisica) pessoas.get(i);
                System.out.println(pessoaFisica.getNome() + " " + pessoaFisica.getSobrenome() + " - " + pessoaFisica.getDocumento());
            }
        }
    }

    public static List<Pessoa> criarPessoas(){
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new pessoaFisica("carlos", "alberto", 12332131l));
        pessoas.add(new pessoaFisica("stella", "jesus", 122133l));
        pessoas.add(new pessoaFisica("yuri", "candido", 123214213l));
        pessoas.add(new pessoaJuridica("hugo", "silva", 123213123l));
        pessoas.add(new pessoaJuridica("saul", "martins", 125535233l));
        pessoas.add(new pessoaJuridica("diego", "silva", 123124153l));
        pessoas.add(new pessoaJuridica("julio", "cezar", 12634564313l));

        return pessoas;
    }
}

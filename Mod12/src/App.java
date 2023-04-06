
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Sexo> sexoPessoa = new ArrayList<>();

        int i = 0;
        String nome;
        String sexo;

        System.out.println("Digite quantos perfis queres criar: ");
        int numeroPerfis = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha deixada no buffer

        while(i < numeroPerfis){
            System.out.println("Digite o " + (i+1) + "º usuario: ");
            nome = scan.nextLine();
            System.out.println("Digite o sexo do usuario " + (i+1) + ", apenas M(masculino) e F(feminino): ");
            sexo = scan.nextLine();
            if(!sexo.equals("M") && !sexo.equals("F")){//ou tambem "&&"//
                System.out.println("Digite apenas M ou F, se não, não vai funcionar! aperte qualquer tecla para voltar.");
                String enter = scan.nextLine();
                i = i - 1;
            }
            i++;
            sexoPessoa.add(new Sexo(nome, sexo));
        }

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

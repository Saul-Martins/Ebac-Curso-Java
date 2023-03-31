import java.util.Scanner;

public class Soma {
    public static double somaNotas() {
        Scanner scan = new Scanner(System.in);
        NotasDosAlunos Notas = new NotasDosAlunos();

        System.out.println("Digite a primeira nota de 0 à 10: ");
        Notas.nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota de 0 à 10: ");
        Notas.nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota de 0 à 10: ");
        Notas.nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota de 0 à 10: ");
        Notas.nota4 = scan.nextInt();

        double mediaAlunos = Notas.nota1 + Notas.nota2 + Notas.nota3 + Notas.nota4;
        double mediaFinal = mediaAlunos / 4;

        return mediaFinal;
    }
}

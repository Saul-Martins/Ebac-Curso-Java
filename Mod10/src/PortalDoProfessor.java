import java.util.Scanner;

public class PortalDoProfessor {
    public static void main(String[] args) {
        Verificador();

    }
    public static void Verificador(){
        double mediaFinal = Soma.somaNotas(); //NotaFinal
        if(mediaFinal >= 0 && mediaFinal < 5){
            System.out.println("O Aluno reprovou!");
        }else if(mediaFinal >= 5 && mediaFinal <= 7){
            System.out.println("O Aluno está em recuperação!");
        }else if(mediaFinal > 7 && mediaFinal <= 10){
            System.out.println("O Aluno foi aprovado!");
        }else{
                System.out.println("A nota digitada não está correta!");
    }
    }

}

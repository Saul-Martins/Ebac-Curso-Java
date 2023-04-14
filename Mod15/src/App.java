import Structure.EconomyCarFactory;
import Structure.LuxuryCarFactory;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        acao1();

    }
    public static void acao1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Quero contruir carros || 2 - Cancelar");
        int option1 = scan.nextInt();
        if(option1 == 1){
            acao2();
        }else{
            //cancelar
        }
    }
    public static void acao2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Economico || 2 - Luxuoso");
        int option1 = scan.nextInt();
        if(option1 == 1){
            EconomyCarFactory economyCarFactory =  new EconomyCarFactory();
            economyCarFactory.criarCarro();
            economyCarFactory.criarMotor();
            acao3();
        }else if(option1 == 2){
            LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
            luxuryCarFactory.criarCarro();
            luxuryCarFactory.criarMotor();
            acao3();
        }else{
            System.out.println("Opção inválida");
        }

    }
    public static void acao3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Criar outros || 2 - Sair");
        int option1 = scan.nextInt();
        if(option1 == 1){
            acao2();
        }else{
            //cancelar
        }
    }
}

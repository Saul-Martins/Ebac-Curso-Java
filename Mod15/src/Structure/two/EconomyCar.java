package Structure.two;
import java.util.Scanner;

public class EconomyCar implements ICar{
    String priceType;
    String color;
    public String color() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Escolha a cor\n1 - Preto\n2 - Branco\n3 - cinza");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            color = "black";
            return color;
        }else if(opcao == 2){
            color = "white";
            return color;
        }else if(opcao == 3){
            color = "gray";
            return color;
        }else {
            System.out.println("OPÇÃO INVALIDA!");
        }
        return null;
    }

    public String priceType(){
        Scanner scan = new Scanner(System.in);


        System.out.println("\n1 - Super Barato\n2 - Barato");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            priceType = "Super Barato";
            return priceType;
        }else if(opcao == 2){
            priceType = "Barato";
            return priceType;
        }else {
            System.out.println("OPÇÃO INVALIDA!");
        }
        return null;
    }

}

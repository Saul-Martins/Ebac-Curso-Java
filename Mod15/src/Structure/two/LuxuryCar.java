package Structure.two;

import java.util.Scanner;

public class LuxuryCar implements ICar{
    String color;
    String priceType;
    public String color() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Escolha a cor\n1 - Preto\n2 - Branco");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            color = "black";
            return color;
        }else if(opcao == 2){
            color = "white";
            return color;
        }else {
            System.out.println("OPÇÃO INVALIDA!");
        }
        return null;
    }

    public String priceType(){
        Scanner scan = new Scanner(System.in);


        System.out.println("\n1 - Caro\n2 - Super Caro");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            priceType = "Caro";
            return priceType;
        }else if(opcao == 2){
            priceType = "Super Caro";
            return priceType;
        }else {
            System.out.println("OPÇÃO INVALIDA!");
        }

        return null;
    }
    public void consult(){
        System.out.println(color + "\n" + priceType + "\n");
    }
}

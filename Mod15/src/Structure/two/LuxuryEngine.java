package Structure.two;

import java.util.Scanner;

public class LuxuryEngine implements IEngine{
    String engineOption;
    public String engineOption() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Selecione o tipo de motor:\n1 - Elétrico\n2 - Gasolina");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            engineOption = "Elétrico";
            return engineOption;
        }else if(opcao == 2){
            engineOption = "Gasolina";
            return engineOption;
        }else {
            System.out.println("OPÇÃO INVALIDA!");
        }
        return null;
    }
    public void priceType() {
        //no content
    }
}

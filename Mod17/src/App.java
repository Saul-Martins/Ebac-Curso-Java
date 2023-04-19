import Carros.Carros;
import Carros.Ford;
import Carros.Fiat;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Carros> carros = new ArrayList<>();

        carros.add(new Ford("Mustang", "Ford", 1964));
        carros.add(new Fiat("Pulse", "Fiat", 2021));
        carros.add(new Ford("VanDaEbac", "Ford", 2000));
        carros.add(new Fiat("Palio Fire", "Fiat", 2015));

        Impressão(carros);
    }
    public static <T> void Impressão(List<T> lista){
        for(T st : lista) {
            System.out.println(st + "\n");
        }
    }
}

package Structure;

import Structure.two.LuxuryCar;
import Structure.two.LuxuryEngine;

public class LuxuryCarFactory implements ICarFactory{
    LuxuryCar luxuryCar = new LuxuryCar();
    LuxuryEngine luxuryEngine = new LuxuryEngine();
    public void criarCarro(){

        luxuryCar.color();
        luxuryCar.priceType();


    }

    public void criarMotor(){

        luxuryEngine.engineOption();
    }
}

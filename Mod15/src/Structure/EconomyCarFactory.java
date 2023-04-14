package Structure;

import Structure.two.EconomyCar;
import Structure.two.EconomyEngine;
import Structure.two.LuxuryCar;
import Structure.two.LuxuryEngine;

public class EconomyCarFactory implements ICarFactory{
    EconomyCar economyCar = new EconomyCar();
    EconomyEngine economyEngine = new EconomyEngine();
    public void criarCarro(){

        economyCar.color();
        economyCar.priceType();


    }

    public void criarMotor(){

        economyEngine.engineOption();
    }
}

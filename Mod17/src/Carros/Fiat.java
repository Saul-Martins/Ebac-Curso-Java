package Carros;

public class Fiat extends Carros{

    public Fiat(String modelo, String marca, int ano) {
        setNome(modelo);
        setMarca(marca);
        setAno(ano);
    }
    @Override
    public String toString() {
        return "Fiat " + getNome() + " de " + getAno();
    }
}

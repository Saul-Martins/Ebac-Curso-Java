package Carros;

public class Ford extends Carros{

    public Ford(String modelo, String marca, int ano) {
        setNome(modelo);
        setMarca(marca);
        setAno(ano);
    }
    @Override
    public String toString() {
        return "Ford " + getNome() + " de " + getAno();
    }
}

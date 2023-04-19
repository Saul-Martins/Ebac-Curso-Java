package Carros;

public abstract class Carros {
    private String marca;
    private int ano;
    private String nome;

    // Métodos getters e setters
    //Marca-------------------
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    //ANO---------------------
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    //Nome--------------------
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}

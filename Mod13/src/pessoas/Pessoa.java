package pessoas;

public abstract class Pessoa { //abstract = classe pai
    //pessoa fisica e pessoa juridica
    private String nome;

    private String sobrenome;

    public Pessoa(String nome, String sobrenome, long cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public abstract long getDocumento();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


}



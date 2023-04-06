

public class Sexo {

    private String Nome;
    private String Sexo;

    public Sexo(String Nome, String Sexo) {
        this.Nome = Nome;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = Sexo; //"Sexo" porque ta pegando o public Sexo(String Nome...)

    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String nome) {
        this.Sexo = Sexo;
    }
}

package pessoas;

public class pessoaJuridica extends Pessoa {

    private long cnpj;

    public pessoaJuridica(String nome, String sobrenome, long cnpj) {
        super(nome, sobrenome, cnpj);
        this.cnpj = cnpj;
    }

    @Override
    public long getDocumento() {
        return cnpj;
    }
}
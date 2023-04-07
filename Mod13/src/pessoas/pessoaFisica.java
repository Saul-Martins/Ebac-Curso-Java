package pessoas;
import pessoas.Pessoa;

public class pessoaFisica extends Pessoa {

    private long cpf;

    public pessoaFisica(String nome, String sobrenome, long cpf) {
        super(nome, sobrenome, cpf);
        this.cpf = cpf;
    }

    @Override
    public long getDocumento() {
        return cpf;
    }
}

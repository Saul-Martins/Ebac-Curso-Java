import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroController {
    private String nome;
    private String email;
    private int idade;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrar() {
        // Chamar o serviço de validação de regras de negócio
        boolean valido = ServicoRegrasNegocio.validar(nome, email, idade, endereco);

        if (valido) {
            // Chamar o repositório para cadastrar as informações
            Repositorio.cadastrar(nome, email, idade, endereco);

            // Exibir mensagem de sucesso
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso!", null));

            // Limpar os campos
            nome = "";
            email = "";
            idade = 0;
            endereco = "";
        } else {
            // Exibir mensagem de erro
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Falha ao cadastrar. Verifique os dados informados.", null));
        }
    }
}


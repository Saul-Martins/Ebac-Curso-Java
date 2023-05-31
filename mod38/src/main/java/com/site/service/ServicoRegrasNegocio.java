public class ServicoRegrasNegocio {
    public static boolean validar(String nome, String email, int idade, String endereco) {
        // Adicione suas regras de negócio aqui
        // Por exemplo:
        if (nome.isEmpty() || email.isEmpty() || idade <= 0 || endereco.isEmpty()) {
            return false; // Falha na validação
        }
        return true; // Validação bem-sucedida
    }
}

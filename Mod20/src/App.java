public class App {

    public static void main(String[] args) {
        Class<MinhaTabela> minhaTabelaClass = MinhaTabela.class;
        Tabela tabelaAnnotation = minhaTabelaClass.getAnnotation(Tabela.class);
        String nomeTabela = tabelaAnnotation.nome();
        System.out.println("Nome da tabela: " + nomeTabela);
    }
}
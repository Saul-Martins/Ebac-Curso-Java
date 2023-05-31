import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Repositorio {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPersistenceUnit");

    public static void cadastrar(String nome, String email, int idade, String endereco) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();

            // Crie sua entidade com mapeamento JPA
            EntidadeCadastro entidade = new EntidadeCadastro();
            entidade.setNome(nome);
            entidade.setEmail(email);
            entidade.setIdade(idade);
            entidade.setEndereco(endereco);

            em.persist(entidade);

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            em.close();
        }
    }
}


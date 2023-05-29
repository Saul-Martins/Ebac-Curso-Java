import javax.persistence.*;

@Entity
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToOne(mappedBy = "acessorio")
    private Carro carro;

    // Construtores, getters e setters
}

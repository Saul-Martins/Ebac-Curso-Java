import javax.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;

    @OneToOne
    private Acessorio acessorio;

    @ManyToOne
    private Marca marca;

    // Construtores, getters e setters
}

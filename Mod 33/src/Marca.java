import javax.persistence.*;
import java.util.List;

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;

    // Construtores, getters e setters
}

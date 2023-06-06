@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> buscarProdutoPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }

    public Produto atualizarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}


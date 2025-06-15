package roteiro8.parte6;

public class ControladorEstoque {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private AdapterFactory factory;

    public ControladorEstoque() { 
        System.out.println("Controlador de Sistema de Estoque Criado"); 
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        this.sistemaEstoqueAdapter = this.factory.criarSistemaEstoqueAdapter(nome);
    }

    public void aumentarQuantidadeItem() {
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}

package roteiro8.parte2;

public class ControladorEstoque {
    private ISistemaEstoqueAdapter sistemaEstoqueAdapter;

    public ControladorEstoque() { 
        System.out.println("Controlador de Sistema de Estoque Criado"); 
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("IBM")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if (nome.equals("DELL")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        }
    }

    public void aumentarQuantidadeItem() {
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}

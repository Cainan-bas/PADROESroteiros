package roteiro8.parte4;

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
        }  else if (nome.equals("SAP")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterSAP();
        }
    }

    public void aumentarQuantidadeItem() {
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}

package roteiro8.parte4;

public class ControladorRegistradora {
    private ISistemaEstoqueAdapter sistemaEstoqueAdapter;
    private ISistemaContabilAdapter sistemaContabilAdapter;

    public ControladorRegistradora() {
        System.out.println("Controlador de Sistema de Registradora Criado");
    }

    public void criarSistemaContabilAdapter(String nome) {
        if (nome.equals("IBM")) {
            this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
        } else if (nome.equals("DELL")) {
            this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
        } else if (nome.equals("SAP")) {
            this.sistemaContabilAdapter = new SistemaContabilAdapterSAP();
        }
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("IBM")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if (nome.equals("DELL")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        } else if (nome.equals("SAP")) {
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterSAP();
        }
    }
    
    public void diminuirQuantidadeItem(){ 
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem(); 
    } 

    public void registrarVendaSistemaContabil(){ 
        this.sistemaContabilAdapter.finalizarVenda(); 
    } 
}

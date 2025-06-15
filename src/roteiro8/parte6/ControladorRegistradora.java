package roteiro8.parte6;

public class ControladorRegistradora {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private SistemaContabilAdapter sistemaContabilAdapter;
    private AdapterFactory factory;

    public ControladorRegistradora() {
        System.out.println("Controlador de Sistema de Registradora Criado");
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaContabilAdapter(String nome) {
        this.sistemaContabilAdapter = this.factory.criarSistemaContabilAdapter(nome);
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        this.sistemaEstoqueAdapter = this.factory.criarSistemaEstoqueAdapter(nome);
    }
    
    public void diminuirQuantidadeItem(){ 
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem(); 
    } 

    public void registrarVendaSistemaContabil(){ 
        this.sistemaContabilAdapter.finalizarVenda(); 
    } 
}

package roteiro1.parte5;

public class PedidoEletronicos extends Pedido {
    
    private String setor;

    public PedidoEletronicos(double valor, String setor) {
        super(valor);
        this.setor = setor;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // @Override
    // public double calcularFreteComum() {
    //     return 0.05 * valor;
    // }

    // @Override
    // public double calcularFreteExpresso() {
    //     return 0.10 * valor;
    // }
}

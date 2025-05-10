package roteiro1.parte5;

public class PedidoMoveis extends Pedido {
    
    private String tipo;
    
    public PedidoMoveis(double valor, String tipo) {
        super(valor);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

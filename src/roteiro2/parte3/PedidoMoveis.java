package roteiro2.parte3;

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

    @Override
    public void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal para o pedido de moveis do tipo: " + tipo);
    }
    
}

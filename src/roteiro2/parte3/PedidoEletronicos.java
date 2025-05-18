package roteiro2.parte3;

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

    @Override
    public void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal para o pedido de eletronicos do setor: " + setor);
    }
}

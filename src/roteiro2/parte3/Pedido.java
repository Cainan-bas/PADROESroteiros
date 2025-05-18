package roteiro2.parte3;

public abstract class Pedido {
    
    protected double valor;
    protected Frete frete;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularFrete() {
        return frete.calcularFrete(valor);
    }

    public abstract void emitirNotaFiscal();

    public void processarPedido() {
        System.out.println("Frete: " + calcularFrete());
        emitirNotaFiscal();
    }
}

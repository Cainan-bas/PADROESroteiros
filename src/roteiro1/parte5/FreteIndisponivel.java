package roteiro1.parte5;

public class FreteIndisponivel implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        throw new UnsupportedOperationException("Frete indisponível para este pedido.");
    }
    
}

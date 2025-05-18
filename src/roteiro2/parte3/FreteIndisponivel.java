package roteiro2.parte3;

public class FreteIndisponivel implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        throw new UnsupportedOperationException("Frete indisponível para este pedido.");
    }
    
}

package roteiro2.parte3;

public class FreteExpresso implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.10;
    }
    
}

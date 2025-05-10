package roteiro1.parte5;

public class FreteExpresso implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.10;
    }
    
}

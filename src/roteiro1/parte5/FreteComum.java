package roteiro1.parte5;

public class FreteComum implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.05;
    }
    
}

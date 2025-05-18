package roteiro2.parte3;

public class FreteComum implements Frete {
    
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.05;
    }
    
}

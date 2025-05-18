package roteiro2.parte1;

public class TestePagamento {
    public static void main(String[] args) {
        Gateway gateway = new Gateway();
        double valor = 1000;
        PagamentoCredito pagtoCredito = new PagamentoCredito(valor, gateway);
        pagtoCredito.realizarCobranca();
        System.out.println("*****************************\n");
        PagamentoDebito pagtoDebito = new PagamentoDebito(valor, gateway);
        pagtoDebito.realizarCobranca();
        System.out.println("*****************************\n");
        PagamentoDinheiro pagtoDinheiro = new PagamentoDinheiro(valor, gateway);
        pagtoDinheiro.realizarCobranca();
    }
}

// Nesse implementação, é possivel observar que o metodo realizarCobranca() é o mesmo para os três tipos de pagamento, o que pode ser visto como uma duplicaçao de código.
// As classes de pagamento (PagamentoCredito, PagamentoDebito e PagamentoDinheiro) parecem violar alguns principios do SOLID, especialmente o Princípio da Responsabilidade Única (SRP) 
//e o Princípio Aberto e Fechado.

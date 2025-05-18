package roteiro2.parte2;

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

// Sim, a modelagem permite usar todas instancias com um unico tipo de pagamento.
// É importante pq demostra o pradrão Template, com sua superclasse Pagamento centralizando os algoritmos de
// cobrança e as subclasses implementando os métodos específicos de cada tipo de pagamento.

// 8 - Ambas fazem uso de polimorfismo e emcapsulamento através do uso de métodos abstratos e métodos concretos.
// Tomando como referencia a classe Pagamento esta fazendo papel de Strategy, enquanto a classe TestePagamento o papel de client.
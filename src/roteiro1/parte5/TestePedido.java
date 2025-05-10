package roteiro1.parte5;

public class TestePedido {
    public static void main(String[] args) {

        // Pedido de Eletrônicos com frete comum
        PedidoEletronicos pedido1 = new PedidoEletronicos(1000.0, "Informática");
        pedido1.frete = new FreteComum(); // frete comum disponível
        System.out.println("Frete comum para Eletrônicos: R$ " + pedido1.calcularFrete());
        pedido1.frete = new FreteExpresso(); // frete comum disponível
        System.out.println("Frete expresso para Eletrônicos: R$ " + pedido1.calcularFrete());
        pedido1.frete = new FreteIndisponivel(); // frete comum disponível
        try {
            System.out.println(pedido1.calcularFrete());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        // Pedido de Móveis com frete expresso
        PedidoMoveis pedido2 = new PedidoMoveis(2000.0, "Sala");
        pedido2.frete = new FreteComum(); // frete expresso disponível
        System.out.println("Frete comum para Móveis: R$ " + pedido2.calcularFrete());
        pedido2.frete = new FreteExpresso(); // frete expresso disponível
        System.out.println("Frete expresso para Móveis: R$ " + pedido2.calcularFrete());
        pedido2.frete = new FreteIndisponivel(); // frete expresso disponível
        try {
            System.out.println(pedido2.calcularFrete());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}


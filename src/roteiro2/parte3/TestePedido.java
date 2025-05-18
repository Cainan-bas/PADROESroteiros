package roteiro2.parte3;

public class TestePedido {
    public static void main(String[] args) {

        // Pedido de Eletrônicos com frete comum
        PedidoEletronicos pedido1 = new PedidoEletronicos(1000.0, "Informática");
        pedido1.frete = new FreteComum(); // frete comum disponível
        pedido1.processarPedido();
        pedido1.frete = new FreteExpresso(); // frete comum disponível
        pedido1.processarPedido();
        pedido1.frete = new FreteIndisponivel(); // frete comum disponível
        try {
            pedido1.processarPedido();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        // Pedido de Móveis com frete expresso
        PedidoMoveis pedido2 = new PedidoMoveis(2000.0, "Sala");
        pedido2.frete = new FreteComum(); // frete expresso disponível
        pedido2.processarPedido();
        pedido2.frete = new FreteExpresso(); // frete expresso disponível
        pedido2.processarPedido();
        pedido2.frete = new FreteIndisponivel(); // frete expresso disponível
        try {
            pedido2.processarPedido();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}


package roteiro6.parte4;

public class TesteComFacade {
    public static void main(String[] args) {

        Facade facade = Facade.getInstance();

        
        facade.registrarCliente("Jose", 222);

        facade.comprar(1, 222);
        facade.comprar(2, 222);

        facade.finalizarCompra(222);
    }
}

// A refatoração do código colocando o conseito do Singleton, gera uma centralização do codigo, onde o facade unico vai gerenciar as transações e centralizar em um unico banco de dados.

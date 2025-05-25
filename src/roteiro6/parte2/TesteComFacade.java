package roteiro6.parte2;

public class TesteComFacade {
    public static void main(String[] args) {

        Facade facade = new Facade();
        
        facade.registrarCliente("Jose", 222);

        facade.comprar(1, 222);
        facade.comprar(2, 222);

        facade.finalizarCompra(222);
    }
}

// Comparando as classes TesteSemFacade e TesteComFacade, podemos observar uma redução significativa na complexidade do código. O cliente não precisa mais se preocupar com os detalhes de 
// implementação do banco de dados, carrinho de compras e produtos, sabendo apenas nomes de metodos genéricos sem conhecer seu funcionamento.

// Caso aja uma mudança na regra de negocio, o cliente não precisa se preocupar com isso, pois a implementação do facade pode ser alterada sem afetar o código do cliente.
package roteiro6.parte3;

public class TesteComFacade {
    public static void main(String[] args) {

        Facade facade = new Facade();
        
        facade.registrarCliente("Jose", 222);

        facade.comprar(1, 222);
        facade.comprar(2, 222);

        facade.finalizarCompra(222);
    }
}

// 4 - É possivel perceber que coesão e acoplamento são conceitos inversamente proporcionais. Sendo a coesão 
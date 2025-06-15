package roteiro7.parte2;

public class TesteBoleto {
    public static void main(String[] args) {
        BancoCaixa banco = new BancoCaixa(new BoletoSimpleFactory());

        try {
            banco.gerarBoleto(10, 100);
            banco.gerarBoleto(30, 100);
            banco.gerarBoleto(60, 100);
            banco.gerarBoleto(90, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// 5 - 
// - Só consegui perceber que quando for criado um novo tipo de boleto, não será necessário modificar a classe BancoCaixa, apenas a classe BoletoSimpleFactory.

// -  Iria gera uma grande duplicação de código.
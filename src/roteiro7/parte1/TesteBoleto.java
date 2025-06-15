package roteiro7.parte1;

public class TesteBoleto {
    public static void main(String[] args) {
        BancoCaixa banco = new BancoCaixa();
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

// Sim, existe um forte acoplamento entre as classes Boleto e BancoCaixa, onde BancoCaixa depende diretamente das subclasses de Boleto.
// Caso surgisse a necessidade de criar novos tipos de boletos ou trabalhar com outros brancos, seria necessário modificar a classe já existente BancoCaixa. O que fere principio do SOLID.
package roteiro3.parte3;

public class TesteNotificacao {
    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        Observer cli01 = new Cliente("Cliente Jose", "jose@empresa.com");
        Observer cli02 = new Cliente("Cliente Maria", "maria@empresa.com");
        Observer func01 = new Funcionario("Funcionario Pedro", "pedro@empresa.com", "Diretor");
        Observer fornecedor01 = new Fornecedor("Funcionario Pedro", "pedro@empresa.com", "111222333666777");

        newsletter.adicionarObserver(cli01);
        newsletter.adicionarObserver(cli02);
        newsletter.adicionarObserver(func01);
        newsletter.adicionarObserver(fornecedor01);

        newsletter.enviarMensagem("Oferta Especial !");
    }
}


// Os ajustes estao coerentes com o principio de substituicao de Liskov, pois as classes Funcionario, Fornecedor e Cliente implementam a interface Observer e podem ser substituidas
// por Observer sem alterar a logica do codigo.
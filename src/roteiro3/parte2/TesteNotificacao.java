package roteiro3.parte2;

public class TesteNotificacao {
    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        Observer cli01 = new Cliente("Cliente Jose", "jose@empresa.com");
        Observer cli02 = new Cliente("Cliente Maria", "maria@empresa.com");

        newsletter.adicionarObserver(cli01);
        newsletter.adicionarObserver(cli02);

        newsletter.enviarMensagem("Oferta Especial !");
    }
}

// Nao parece interessante replicar a classe Cliente em outras como fornecedor e funcionario, pois vai gerar duplicacao de codigo e problemas de escalabilidade.
package roteiro3.parte4;

public class Funcionario implements Observer {
    private String nome;
    private String email;
    private String cargo;
    private String telefone;
    private NotificacaoStrategy notificacaoStrategy;

    public Funcionario(String nome, String email, String cargo, String telefone, NotificacaoStrategy notificacaoStrategy) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.telefone = telefone;
        this.notificacaoStrategy = notificacaoStrategy;
    }

    @Override
    public void update(String mensagem) {
        String destinatario = (notificacaoStrategy instanceof NotificacaoEmail) ? email : telefone;
        StringBuilder mensagemFormatada = new StringBuilder();
        mensagemFormatada.append("---------------NOTIFICACAO " + getTipoObserver() + "------------------\n");
        mensagemFormatada.append("Notificação enviada para " + nome + " (" + destinatario + ")\n");
        mensagemFormatada.append(mensagem + "\n");
        mensagemFormatada.append("-----------------------------------------------------------------------\n");
        this.notificacaoStrategy.enviarMensagem(destinatario, mensagemFormatada.toString());
    }

    @Override
    public String getTipoObserver() {
        return "FUNCIONARIO";
    }


    @Override
    public void setNotificacaoStrategy(NotificacaoStrategy notificacaoStrategy) {
        this.notificacaoStrategy = notificacaoStrategy;
    }

}

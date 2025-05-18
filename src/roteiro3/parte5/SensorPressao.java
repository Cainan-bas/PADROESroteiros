package roteiro3.parte5;

public class SensorPressao implements Observer {
    private float pressao;

    public SensorPressao(float pressao) {
        this.pressao = pressao;
    }

    public void verificarPressao() {
        if (this.pressao <= 100) {
            System.out.println("Pressão OK\n");
        } else {
            System.out.println("Pressão muito alta, acima de 100Pa\n");
        }
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
        this.update("Atualizando sensores...");
    }

    @Override
    public void update(String mensagem) {
        System.out.println("----------- NOTIFICACAO Pressao --------------------------------");
        this.verificarPressao();
    }

}

package roteiro3.parte5;

public class SensorUmidade implements Observer {
    private float umidade;

    public SensorUmidade(float umidade) {
        this.umidade = umidade;
    }

    public void verificarUmidade() {
        if (this.umidade >= 30) {
            System.out.println("Umidade OK\n");
        } else {
            System.out.println("Umidade muito baixa em relação ao ar\n");
        }
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
        this.update("Atualizando sensores...");
    }

    @Override
    public void update(String mensagem) {
        System.out.println("----------- NOTIFICACAO umidade --------------------------------");
        this.verificarUmidade();
    }
    
}

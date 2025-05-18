package roteiro3.parte5;

public class SensorTemperatura implements Observer {
    private float temperatura;

    public SensorTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void verificarTemperatura() {
        if (this.temperatura <= 40) {
            System.out.println("Temperatura OK\n");
        } else {
            System.out.println("Temperatura muito alto, acima de 40 graus\n");
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        this.update("Atualizando sensores...");
    }

    @Override
    public void update(String mensagem) {
        System.out.println("----------- NOTIFICACAO temperatura --------------------------------");
        this.verificarTemperatura();
    }

}

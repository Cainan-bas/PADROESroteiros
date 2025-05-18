package roteiro3.parte5;

public class TesteSensores {
    public static void main(String[] args) {

        Sensor sensor = new Sensor();
        SensorPressao sensorPressao = new SensorPressao(90);
        SensorTemperatura sensorTemperatura = new SensorTemperatura(41);
        SensorUmidade sensorUmidade = new SensorUmidade(39);
        

        sensor.adicionarObserver(sensorPressao);
        sensor.adicionarObserver(sensorTemperatura);
        sensor.adicionarObserver(sensorUmidade);

        sensor.enviarMensagem("Atualizando sensores...");
        System.out.println("--------------------------------------------------\n");

        sensorPressao.setPressao(110);

    }
}

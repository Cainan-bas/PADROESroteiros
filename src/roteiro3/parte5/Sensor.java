package roteiro3.parte5;

import java.util.ArrayList;

public class Sensor {
    private ArrayList<Observer> observer;

    public Sensor() {
        this.observer = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        this.observer.add(observer);
    }

    public void removerObserver(Observer observer) {
        this.observer.remove(observer);
    }

    public void enviarMensagem(String mensagem) {
        for (Observer observer : observer) {
            observer.update(mensagem);
        }
    }
}

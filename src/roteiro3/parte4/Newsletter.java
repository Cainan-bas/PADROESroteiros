package roteiro3.parte4;

import java.util.ArrayList;

public class Newsletter {
    private ArrayList<Observer> observers;

    public Newsletter() {
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void alterarObserver(Observer observer, NotificacaoStrategy notificacaoStrategy) {
        for (int i = 0; i < observers.size(); i++) {
            if (observers.get(i) == observer) {
                observers.get(i).setNotificacaoStrategy(notificacaoStrategy);
                return;
            }
        }
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void enviarMensagem(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }
}
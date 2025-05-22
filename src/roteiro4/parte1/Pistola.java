package roteiro4.parte1;

public class Pistola implements Arma {

    @Override
    public void carregar() {
        System.out.println("Carregando a pistola");
    }

    @Override
    public void atirar() {
        System.out.println("Pistola com tiro certo");
    }

    @Override
    public void mirar() {
        System.out.println("Você está na mira");
    }
}

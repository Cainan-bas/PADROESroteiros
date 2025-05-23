package roteiro5.parte1;

public class Teste {
    public static void main(String[] args) {

        ControladorAereo c1 = new ControladorAereo();
        ControladorAereo c2 = new ControladorAereo();

        c1.solicitarDecolagem();
        c2.solicitarDecolagem();

        System.out.println(" ");

        c1.solicitarAterrissagem();
        c2.solicitarAterrissagem();
    }
}

// Não ocorreu como deveria, pois o controlador de c1 não deveria permitir a decolagem do c2, já que o controlador de c1 já tinha dado permissão para decolar.
// O mesmo ocorre com a aterrissagem, o controlador de c2 não deveria permitir a aterrissagem do c1, já que o controlador de c2 já tinha dado permissão para aterrissar.
// O que ocorre é que o controlador de c1 e c2 são instâncias diferentes, então cada um tem seu próprio estado.
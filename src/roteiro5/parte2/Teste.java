package roteiro5.parte2;

public class Teste {
    public static void main(String[] args) {
        

        ControladorAereo c1 = ControladorAereo.getInstance();
        ControladorAereo c2 = ControladorAereo.getInstance();


        c1.solicitarDecolagem();
        c2.solicitarDecolagem();

        System.out.println(" ");

        c1.solicitarAterrissagem();
        c2.solicitarAterrissagem();
    }
}

// Sim, agora o controlador de c1 e c2 são a mesma instância, então o controlador de c1 não permite a decolagem do c2, já que o controlador de c1 já tinha dado permissão para decolar.
package roteiro8.parte5;

import dominio.SistemaContabil;

public abstract class SistemaContabilAdapter {

    protected SistemaContabil sistemacontabil;

    public void finalizarVenda() { 
        this.sistemacontabil.registrarVenda(); 
    } 

    public void registrarImposto() { 
        this.sistemacontabil.calcularImposto(); 
    } 
}

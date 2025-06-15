package roteiro8.parte5;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterDELL extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterDELL() {
        this.sistemaestoque = new SistemaEstoque("DELL");
    }
    
}

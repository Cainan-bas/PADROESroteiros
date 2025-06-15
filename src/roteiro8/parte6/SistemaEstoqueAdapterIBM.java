package roteiro8.parte6;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterIBM extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterIBM() {
        this.sistemaestoque = new SistemaEstoque("IBM");
    }
    
}

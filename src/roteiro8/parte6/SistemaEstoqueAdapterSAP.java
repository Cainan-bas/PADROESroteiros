package roteiro8.parte6;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterSAP extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterSAP() {
        this.sistemaestoque = new SistemaEstoque("SAP");
    }


    
}

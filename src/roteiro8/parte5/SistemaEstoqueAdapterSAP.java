package roteiro8.parte5;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterSAP extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterSAP() {
        this.sistemaestoque = new SistemaEstoque("SAP");
    }


    
}

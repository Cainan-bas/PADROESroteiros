package roteiro8.parte4;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterSAP implements ISistemaEstoqueAdapter {

    private SistemaEstoque sistemaestoque;

    public SistemaEstoqueAdapterSAP() {
        this.sistemaestoque = new SistemaEstoque("SAP");
    }

    @Override
    public void diminuirQuantidadeItem() {
        this.sistemaestoque.removerItemEstoque();
    }

    @Override
    public void aumentarQuantidadeItem() {
        this.sistemaestoque.adicionarItemEstoque();
    }
    
}

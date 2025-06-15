package roteiro8.parte4;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter {

    private SistemaEstoque sistemaestoque;

    public SistemaEstoqueAdapterIBM() {
        this.sistemaestoque = new SistemaEstoque("IBM");
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

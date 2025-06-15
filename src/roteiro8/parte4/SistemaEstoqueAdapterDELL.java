package roteiro8.parte4;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterDELL implements ISistemaEstoqueAdapter {

    private SistemaEstoque sistemaestoque;

    public SistemaEstoqueAdapterDELL() {
        this.sistemaestoque = new SistemaEstoque("DELL");
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

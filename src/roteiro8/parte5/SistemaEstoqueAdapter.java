package roteiro8.parte5;

import servico.SistemaEstoque;

public abstract class SistemaEstoqueAdapter {
    
    protected SistemaEstoque sistemaestoque;

    public void diminuirQuantidadeItem() {
        this.sistemaestoque.removerItemEstoque();
    }

    public void aumentarQuantidadeItem() {
        this.sistemaestoque.adicionarItemEstoque();
    }
}

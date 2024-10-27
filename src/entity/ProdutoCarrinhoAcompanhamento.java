package entity;

public class ProdutoCarrinhoAcompanhamento {
    private int id;
    private ProdutoAcompanhamento produtoAcompanhamento;
    private Pedido pedido;

    public ProdutoCarrinhoAcompanhamento(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdutoAcompanhamento getProdutoAcompanhamento() {
        return this.produtoAcompanhamento;
    }

    public void setProdutoAcompanhamento(ProdutoAcompanhamento produtoAcompanhamento) {
        this.produtoAcompanhamento = produtoAcompanhamento;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}

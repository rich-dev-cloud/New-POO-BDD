package entity;

public class ProdutoAcompanhamento {
    private int id;
    private Produto produto;
    private Acompanhamento acompanhamento;

    public ProdutoAcompanhamento(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Acompanhamento getAcompanhamento() {
        return this.acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}

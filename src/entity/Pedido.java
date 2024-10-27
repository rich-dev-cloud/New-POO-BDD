package entity;

public class Pedido {
    private int id;
    private Endereco endereco;
    private FormaPagamento formaPagamento;
    private StatusEntegra statusEntegra;
    private float valorTotal;

    public Pedido(int id, float valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusEntegra getStatusEntegra() {
        return this.statusEntegra;
    }

    public void setStatusEntegra(StatusEntegra statusEntegra) {
        this.statusEntegra = statusEntegra;
    }
}

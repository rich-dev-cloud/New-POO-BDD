package entity;

public class HistoricoPagamento {
    private int id;
    private Pedido pedido;
    private Restaurante restaurante;
    private FormaPagamento formaPagamento;
    private Promocao promocao;
    private String dataPagamento;
    private String horarioPagamento;

    public HistoricoPagamento(int id, String dataPagamento, String horarioPagamento) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.horarioPagamento = horarioPagamento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Promocao getPromocao() {
        return this.promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public String getDataPagamento() {
        return this.dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getHorarioPagamento() {
        return this.horarioPagamento;
    }

    public void setHorarioPagamento(String horarioPagamento) {
        this.horarioPagamento = horarioPagamento;
    }
}

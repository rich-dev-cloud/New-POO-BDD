package entity;

public class HistoricoEntrega {
    private int id;
    private Pedido pedido;
    private Restaurante restaurante;
    private StatusEntegra statusEntegra;
    private String dataEntrega;
    private String horarioEntrega;

    public HistoricoEntrega(int id, String dataEntrega, String horarioEntrega) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.horarioEntrega = horarioEntrega;
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

    public StatusEntegra getStatusEntegra() {
        return this.statusEntegra;
    }

    public void setStatusEntegra(StatusEntegra statusEntegra) {
        this.statusEntegra = statusEntegra;
    }

    public String getDataEntrega() {
        return this.dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getHorarioEntrega() {
        return this.horarioEntrega;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }
}

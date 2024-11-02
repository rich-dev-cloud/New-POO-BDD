package entity;

public class Estabelecimento {
    private final static int ABERTO = 1;
    private final static int FECHADO = 0;
    protected String address;
    protected int status;

    public Estabelecimento(String address) {
        this.address = address;
        this.status = FECHADO;
    }

    public int abrir() {
        this.status = ABERTO;
        return this.status;
    }

    public int fechar() {
        this.status = FECHADO;
        return this.status;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
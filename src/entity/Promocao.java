package entity;

public class Promocao {
    private int id;
    private Restaurante restaurante;
    private Produto produto;
    private float descontoPorcentagem;

    public Promocao(int id, float descontoPorcentagem) {
        this.id = id;
        this.descontoPorcentagem = descontoPorcentagem;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDescontoPorcentagem() {
        return this.descontoPorcentagem;
    }

    public void setDescontoPorcentagem(float descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    } 

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

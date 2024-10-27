package entity;

public class Avaliacao {
    private int id;
    private Restaurante restaurante;
    private String descricao;
    private int nota;
    
    public Avaliacao(int id, String descricao, int nota) {
        this.id = id;
        this.descricao = descricao;
        this.nota = nota;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}

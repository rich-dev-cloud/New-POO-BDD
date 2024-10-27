package entity;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private List<Restaurante> restaurantes;

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.restaurantes = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Restaurante> getRestaurante() {
        return this.restaurantes;
    }

    public void adicionarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
        restaurante.setCategoria(this);
    }
}

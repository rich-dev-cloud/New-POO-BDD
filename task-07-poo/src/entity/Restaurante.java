package entity;

import java.util.List;

public class Restaurante extends Estabelecimento {
    private String nome;
    private List<Prato> pratos;
    private List<Funcionario> funcionarios;

    public Restaurante(String nome, String address) {
        super(address);
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFunctionarios() {
        return this.funcionarios;
    }

    public void addFuncionario(Funcionario functionario) {
        this.funcionarios.add(functionario);
        functionario.setRestaurante(this);
    }

    public List<Prato> getPratos() {
        return this.pratos;
    }

    public void addPrato(Prato prato) {
        this.pratos.add(prato);
        prato.setRestaurante(this);
    }
}

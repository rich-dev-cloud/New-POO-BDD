package entity;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;
    private Restaurante restaurante;

    public Funcionario(String nome, double salario, int idade, Restaurante restaurante) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.restaurante = restaurante;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}

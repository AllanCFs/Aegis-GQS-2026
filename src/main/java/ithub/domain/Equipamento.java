package ithub.domain;

public class Equipamento {
    private String id;
    private String nome;
    private String categoria;
    private double valorDiaria;
    private String status; // "PENDENTE_AUDITORIA", "DISPONIVEL", "INDISPONIVEL"

    public Equipamento(String id, String nome, String categoria, double valorDiaria) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do equipamento é obrigatório.");
        }
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero.");
        }
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.valorDiaria = valorDiaria;
        this.status = "PENDENTE_AUDITORIA";
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getValorDiaria() { return valorDiaria; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}
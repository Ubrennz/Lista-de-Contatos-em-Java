package util;

public class Contatos {
    private String nome;
    private String telefone;

    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public String toString() {
        return nome + " " + telefone;
    }
}

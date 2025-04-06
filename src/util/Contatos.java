package util;

public class Contatos {
    private String nome;
    private String telefone;
    private String data;
    private String hora;

    public Contatos(String nome, String telefone, String data, String hora) {
        this.nome = nome;
        this.telefone = telefone;
        this.data = data;
        this.hora = hora;
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

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String toString() {
        return nome + " " + telefone + " " + data + " " + hora;
    }
}

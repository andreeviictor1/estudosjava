public class Departamento {
    // Atributos
    private String nome;

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

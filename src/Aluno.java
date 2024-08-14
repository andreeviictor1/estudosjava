import java.util.Random;

public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private double codigo_indicador;
    private Random aleatorio;

    // Construtor
    public Aluno(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_indicador = aleatorio.nextDouble();
    }

    // Métodos
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", codigo_indicador=" + codigo_indicador +
                '}';
    }
}

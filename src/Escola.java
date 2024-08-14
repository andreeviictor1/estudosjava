public class Escola {
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos[];
    private Aluno discentes[];
    private int nr_discentes, nr_departamentos;

    // Construtor
    public Escola(String nome, String CNPJ, Endereco endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.departamentos = new Departamento[10];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
        this.discentes = new Aluno[100]; // Inicializa o array de discentes
    }

    // Métodos
    public void criarDepartamento(String nomeDepartamento) {
        if (nr_departamentos < 10) {
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento);
            nr_departamentos++;
        } else {
            System.out.println("Não é possível criar outro Departamento");
        }
    }

    public void matricularAluno(Aluno novoAluno) {
        if (nr_discentes < discentes.length) {
            discentes[nr_discentes] = novoAluno;
            nr_discentes++;
        } else {
            System.out.println("Não é possível cadastrar mais alunos.");
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereco=" + endereco +
                ", nr_departamentos=" + nr_departamentos +
                ", nr_discentes=" + nr_discentes +
                '}';
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Ficticia", 123);
        Escola escola = new Escola("Escola Exemplo", "00.000.000/0001-00", endereco);
        Aluno aluno = new Aluno("Andre", 26);

        escola.matricularAluno(aluno);
        escola.criarDepartamento("Matematica");

        System.out.println(escola);

    }
}

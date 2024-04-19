import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Funcionario(Scanner scanner) {
        System.out.println("Digite o nome do funcionário:");
        this.nome = scanner.nextLine();

        System.out.println("Digite a matrícula do funcionário:");
        this.matricula = scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Hospedagem {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Funcionario responsavel;

    public Hospedagem(Cliente cliente, Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida, Funcionario responsavel) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.responsavel = responsavel;
    }

    public Hospedagem(Scanner scanner, List<Quarto> quartos, Funcionario responsavel) {
        this.responsavel = responsavel;

        System.out.println("Escolha um quarto para hospedagem:");

        for (Quarto quarto : quartos) {
            System.out.println(quarto.getNumero() + " - " + quarto.getCategoria() + " - Valor Diária: R$" + quarto.getValorDiaria());
        }

        System.out.println("Digite o número do quarto:");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número do quarto

        Quarto quartoEscolhido = null;
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                quartoEscolhido = quarto;
                break;
            }
        }

        if (quartoEscolhido == null) {
            System.out.println("Quarto não encontrado.");
            return;
        }

        this.quarto = quartoEscolhido;

        System.out.println("Digite a data de entrada (AAAA-MM-DD):");
        String dataEntradaStr = scanner.nextLine();
        this.dataEntrada = LocalDate.parse(dataEntradaStr);

        System.out.println("Digite a data de saída (AAAA-MM-DD):");
        String dataSaidaStr = scanner.nextLine();
        this.dataSaida = LocalDate.parse(dataSaidaStr);

        // Cria um cliente novo ou busca um cliente já existente
        this.cliente = new Cliente(scanner);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Hospedagem{" +
                "cliente=" + cliente +
                ", quarto=" + quarto +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", responsavel=" + responsavel +
                '}';
    }
}

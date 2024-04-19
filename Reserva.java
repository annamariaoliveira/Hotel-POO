import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataReserva;
    private LocalDate dataDesocupacao;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataReserva, LocalDate dataDesocupacao) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataReserva = dataReserva;
        this.dataDesocupacao = dataDesocupacao;
    }

    public Reserva(Scanner scanner, List<Quarto> quartos) {
        System.out.println("Escolha um quarto para reservar:");

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

        System.out.println("Digite a data de reserva (AAAA-MM-DD):");
        String dataReservaStr = scanner.nextLine();
        this.dataReserva = LocalDate.parse(dataReservaStr);

        System.out.println("Digite a data de desocupação (AAAA-MM-DD):");
        String dataDesocupacaoStr = scanner.nextLine();
        this.dataDesocupacao = LocalDate.parse(dataDesocupacaoStr);

        // Cria um cliente novo ou busca um cliente já existente
        this.cliente = new Cliente(scanner);
    }

    public Reserva(Scanner scanner, Quarto quartoReserva, Funcionario responsavel) {
        //TODO Auto-generated constructor stub
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

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataDesocupacao() {
        return dataDesocupacao;
    }

    public void setDataDesocupacao(LocalDate dataDesocupacao) {
        this.dataDesocupacao = dataDesocupacao;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", quarto=" + quarto +
                ", dataReserva=" + dataReserva +
                ", dataDesocupacao=" + dataDesocupacao +
                '}';
    }
}

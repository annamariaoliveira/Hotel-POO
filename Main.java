import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Quarto> quartos = new ArrayList<>();

        // Adicione alguns quartos para teste
        quartos.add(new Quarto(202, "Econômico", 100.0, "Econômico", 2));
        quartos.add(new Quarto(203, "VIP", 200.0, "VIP", 3));
        quartos.add(new Quarto(204, "Conforto", 150.0, "Conforto", 4));
        quartos.add(new Quarto(205, "Luxo Superior", 300.0, "Luxo Superior", 5));

        System.out.println("Bem-vindo ao sistema de hotel Sol e Mar!");
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Realizar reserva");
            System.out.println("2 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("1-Cadastrar Cliente");
                    System.out.println("2-Ja tenho Cadastro");
                    int cadastroOpcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    String nomeCliente = "";
                    String emailCliente = "";
                    String telefoneCliente = "";

                    if (cadastroOpcao == 1) {
                        System.out.println("Digite o nome do cliente:");
                        nomeCliente = scanner.nextLine();
                        System.out.println("Digite o e-mail:");
                        emailCliente = scanner.nextLine();
                        System.out.println("Digite o telefone:");
                        telefoneCliente = scanner.nextLine();
                    } else if (cadastroOpcao == 2) {
                        System.out.println("Digite o nome completo do cliente:");
                        nomeCliente = scanner.nextLine();
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }

                    System.out.println("Escolha o Tipo de Quarto:");
                    System.out.println("1 - Econômico");
                    System.out.println("2 - VIP");
                    System.out.println("3 - Conforto");
                    System.out.println("4 - Luxo Superior");

                    int tipoQuarto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipoQuarto >= 1 && tipoQuarto <= 4) {
                        System.out.println(quartosDisponiveis(quartos, tipoQuarto));

                        System.out.println("Escolha o Quarto:");
                        int numeroQuarto = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha

                        boolean quartoEncontrado = false;
                        for (Quarto quarto : quartos) {
                            if (quarto.getNumero() == numeroQuarto && quarto.getCategoria().equals(tipoQuartoToString(tipoQuarto))) {
                                quartoEncontrado = true;
                                System.out.println("Parabéns, " + nomeCliente + ", seu quarto é o " + quarto.getNumero() +
                                        " tipo " + quarto.getCategoria() + " no " + quarto.getAndar() + "° andar.");
                                exibirFrigobar(quarto);
                                break;
                            }
                        }

                        if (!quartoEncontrado) {
                            System.out.println("Quarto não encontrado ou não disponível para reserva.");
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    private static String quartosDisponiveis(List<Quarto> quartos, int tipoQuarto) {
        StringBuilder mensagem = new StringBuilder("Quartos disponíveis:\n");

        for (Quarto quarto : quartos) {
            if (quarto.getCategoria().equals(tipoQuartoToString(tipoQuarto))) {
                mensagem.append(quarto.getNumero()).append(" - ").append(quarto.getNome()).append(" - Valor Diária: R$")
                        .append(quarto.getValorDiaria()).append("\n");
            }
        }

        return mensagem.toString();
    }

    private static String tipoQuartoToString(int tipoQuarto) {
        switch (tipoQuarto) {
            case 1:
                return "Econômico";
            case 2:
                return "VIP";
            case 3:
                return "Conforto";
            case 4:
                return "Luxo Superior";
            default:
                return "";
        }
    }

    private static void exibirFrigobar(Quarto quarto) {
        Map<String, Double> frigobarItens = new HashMap<>();
        switch (quarto.getCategoria()) {
            case "Econômico":
                frigobarItens.put("Cerveja", 10.0);
                frigobarItens.put("Água", 2.0);
                frigobarItens.put("Refrigerante", 6.0);
                break;
            case "VIP":
                frigobarItens.put("Cerveja", 10.0);
                frigobarItens.put("Água", 2.0);
                frigobarItens.put("Refrigerante", 6.0);
                frigobarItens.put("Sorvete", 30.0);
                break;
            case "Conforto":
                frigobarItens.put("Cerveja", 10.0);
                frigobarItens.put("Água", 2.0);
                frigobarItens.put("Refrigerante", 6.0);
                frigobarItens.put("Sorvete", 30.0);
                frigobarItens.put("Geleia", 15.0);
                break;
            case "Luxo Superior":
                frigobarItens.put("Cerveja", 10.0);
                frigobarItens.put("Água", 2.0);
                frigobarItens.put("Refrigerante", 6.0);
                frigobarItens.put("Sorvete", 30.0);
                frigobarItens.put("Geleia", 15.0);
                frigobarItens.put("Mousse", 40.0);
                break;
        }

        System.out.println("Frigobar do Quarto " + quarto.getNumero() + ":");
        for (Map.Entry<String, Double> entry : frigobarItens.entrySet()) {
            System.out.println(entry.getKey() + " - R$" + entry.getValue());
        }
    }
}
